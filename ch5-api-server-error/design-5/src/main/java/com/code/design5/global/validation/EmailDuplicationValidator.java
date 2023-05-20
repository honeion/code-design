package com.code.design5.global.validation;

import com.code.design5.domain.member.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.text.MessageFormat;

@Component
@RequiredArgsConstructor
public class EmailDuplicationValidator implements ConstraintValidator<EmailUnique, String> {

    private final MemberRepository memberRepository;

    @Override
    public void initialize(EmailUnique emailUnique) {

    }

    @Override
    public boolean isValid(String email, ConstraintValidatorContext cxt) {

        boolean isExistEmail = memberRepository.existsByEmail(email);

        if (isExistEmail) {
            cxt.disableDefaultConstraintViolation();
            cxt.buildConstraintViolationWithTemplate(
                    MessageFormat.format("Email {0} already exists!", email))
                .addConstraintViolation();
        }
        return !isExistEmail;
    }
}