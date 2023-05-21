package com.code.design7.domain.member.dto;

import com.code.design7.domain.member.domain.Member;
import lombok.Getter;

@Getter
public class MemberSignUpRequest {
    private String name;

    public Member toEntity() {
        return new Member(name);
    }
}
