package com.code.design6.domain.member.service;

import com.code.design6.domain.member.dto.PasswordChangeRequest;

/**
 * 1. 행위를 표현하고 있다. -> 클래스명으로 책임을 명시
 * 2. 인터페이스는 다형성 -> 책임이 명확하기 때문.. 구현체가 다르면 다 구현하기는 좀 그러니
 */
public interface ChangePasswordService {
    public void change(Long id, PasswordChangeRequest dto);
}
