package com.code.design6.domain.member.service;

import com.code.design6.domain.member.dto.PasswordChangeRequest;

public interface ChangePasswordService {
    public void change(Long id, PasswordChangeRequest dto);
}
