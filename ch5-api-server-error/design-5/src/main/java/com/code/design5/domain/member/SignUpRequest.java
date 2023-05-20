package com.code.design5.domain.member;

import com.code.design5.global.validation.EmailUnique;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class SignUpRequest {

    @EmailUnique  //custom한 어노테이션
    @Email
    private String email;

    public SignUpRequest(String email) {
        this.email = email;
    }

}
