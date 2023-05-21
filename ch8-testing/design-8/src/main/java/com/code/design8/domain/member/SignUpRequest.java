package com.code.design8.domain.member;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class SignUpRequest {

    @NotEmpty
    private String name;

    // 테스트 코드에서 밖에 사용하지 않는 코드...
//    public SignUpRequest(String name) {
//        this.name = name;
//    }

    public Member toEntity() {
        return new Member(name);
    }
}