package com.code.desgin2.infra.sms;

public interface SmsSender {

    boolean send(final SmsMessageRequest smsMessageRequest);
}