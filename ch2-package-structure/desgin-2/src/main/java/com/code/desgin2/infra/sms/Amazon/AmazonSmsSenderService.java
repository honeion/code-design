package com.code.desgin2.infra.sms.Amazon;


import com.code.desgin2.infra.sms.Amazon.AmazonSmsClient.SendRequest;
import com.code.desgin2.infra.sms.Amazon.AmazonSmsClient.SendResponse;
import com.code.desgin2.infra.sms.SmsMessageRequest;
import com.code.desgin2.infra.sms.SmsSender;

public class AmazonSmsSenderService implements SmsSender {

    @Override
    public boolean send(final SmsMessageRequest dto) {

        final SendResponse response = new AmazonSmsClient().send(
            new SendRequest(dto.getMessage(), dto.getReceiverNumber(), dto.getItc()));

        return response.status.equals("SUCCESS");
    }
}
