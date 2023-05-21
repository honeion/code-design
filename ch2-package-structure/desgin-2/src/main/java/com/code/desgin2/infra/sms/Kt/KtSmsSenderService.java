package com.code.desgin2.infra.sms.Kt;

import com.code.desgin2.infra.sms.Kt.KtSmsSenderClient.SendRequest;
import com.code.desgin2.infra.sms.Kt.KtSmsSenderClient.SendResponse;
import com.code.desgin2.infra.sms.SmsMessageRequest;
import com.code.desgin2.infra.sms.SmsSender;

public class KtSmsSenderService implements SmsSender {

    @Override
    public boolean send(final SmsMessageRequest dto) {

        final KtSmsSenderClient client = new KtSmsSenderClient();
        final SendResponse response = client.send(new SendRequest(dto.getMessage(), dto.getReceiverNumber()));
        return response.success;
    }
}