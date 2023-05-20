package com.code.design7.domain.member.service;

import com.code.design7.domain.coupon.service.CouponIssueService;
import com.code.design7.domain.member.domain.Member;
import com.code.design7.domain.member.dto.MemberSignUpRequest;
import com.code.design7.domain.member.event.MemberSignedUpEvent;
import com.code.design7.domain.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class MemberSignUpService {

    /*
    시스템 강결합 문제.
     회원 가입 시에 회원생성->메일발송->쿠폰발행 작업이 트랜잭셔널하게 진행된다.
     더 추가적인 dependency가 늘어나고 주입받아 처리해야하는 부분이 늘어날 수 있음.
     exception 발생한 경우, 롤백되더라도, 메일 같은 케이스는 보내질 수 있음.
     -> 순서를 바꿔서 이메일을 마지막에 보내는 방법 :
        일단 이메일이 나가지는 않고 롤백되겠지만,
         이메일 부분에서 에러난 경우 롤백까지 할 필욘 없음.
         try-catch로 메일발송 부분 에러시 보내지 않는 식 처리라도.. 임시방편이 가능한데
     => 이벤트 기반 publisher / listener 사용해서 활용.
     */
    private final MemberRepository memberRepository;
    private final CouponIssueService couponIssueService;
    //    private final EmailSenderService emailSenderService;
    private final ApplicationEventPublisher eventPublisher;

    @Transactional
    public void signUp(final MemberSignUpRequest dto) {
        final Member member = memberRepository.save(dto.toEntity()); // 1. member 엔티티 영속화
//        emailSenderService.sendSignUpEmail(member); // 2. 외부 시스템 이메일 호출
        eventPublisher.publishEvent(new MemberSignedUpEvent(member));
        couponIssueService.issueSignUpCoupon(member.getId()); // 3. 회원가입 쿠폰 발급 -> 예외 발생, 회원, 쿠폰 모두 롤백, 문제는 회원 가입 이메일 전송 완료...

    }
}
