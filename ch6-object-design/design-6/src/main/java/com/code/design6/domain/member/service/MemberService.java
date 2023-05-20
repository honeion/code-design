package com.code.design6.domain.member.service;

import com.code.design6.domain.member.domain.Member;
import com.code.design6.domain.member.dto.PasswordChangeRequest;

public interface MemberService {
    //책임이 명확하지 않다..
    //대체성을 띄느냐... 흠 기준이 갈리겠고먼..

    Member findById(Long id);

    Member findByEmail(String email);

    Member create(Member member);

    //비밀번호 변경하는 기능이 비밀번호 기반으로 변경, 다른 인증수단을 통해 비밀번호 변경 기능 등이 있을 수 있으니
    //대체가 가능할 수 는 있기때문에 인터페이스로 뽑을 수도 있다.
    void changePassword(PasswordChangeRequest dto);

    Member updateName(Long id, String name);

}
