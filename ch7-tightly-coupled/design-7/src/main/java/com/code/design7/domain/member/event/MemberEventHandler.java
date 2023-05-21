package com.code.design7.domain.member.event;

import com.code.design7.infra.email.EmailSenderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionalEventListener;

@Component
@RequiredArgsConstructor
public class MemberEventHandler {
    private final EmailSenderService emailSenderService;

    //    @EventListener
    @TransactionalEventListener
    public void memberSignedUpEventListener(MemberSignedUpEvent dto){
        emailSenderService.sendSignUpEmail(dto.getMember());
    }
}
