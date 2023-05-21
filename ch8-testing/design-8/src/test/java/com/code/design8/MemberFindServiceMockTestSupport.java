package com.code.design8;

import com.code.design8.domain.member.Member;
import com.code.design8.domain.member.MemberFindService;
import com.code.design8.domain.member.MemberRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.assertj.core.api.BDDAssertions.then;
import static org.mockito.BDDMockito.given;

class MemberFindServiceMockTestSupport extends MockTestSupport {

    // 외부 인프라
    @InjectMocks
    private MemberFindService memberFindService;

    @Mock
    private MemberRepository memberRepository;

    @Test
    void mock_test() {
        //given
        final Member member = new Member("yun");

        given(memberRepository.findByName("yun")).willReturn(member);

        //when
        final Member findMember = memberFindService.findByName("yun");

        //then
        then(findMember.getName()).isEqualTo("yun");
    }
}