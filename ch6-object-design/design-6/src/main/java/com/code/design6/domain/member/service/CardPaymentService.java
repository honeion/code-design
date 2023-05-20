package com.code.design6.domain.member.service;

/**
 * 신요앜드 결제.
 * 1. 결제
 * 2. 취소
 */
public interface CardPaymentService {
    void pay();
    void cancel();
}
