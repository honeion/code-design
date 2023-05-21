package com.code.desgin2.infra.sms;

import lombok.Getter;

@Getter
public class SmsMessageRequest {

    private String message;
    private String senderNumber;
    private String receiverNumber;
    private String itc;
}
