package com.code.design6.domain.member.service.impl;

import com.code.design6.domain.member.domain.Member;
import com.code.design6.domain.member.dto.PasswordChangeRequest;
import com.code.design6.domain.member.service.MemberService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MemberServiceImpl implements MemberService {

    @Override
    public Member findById(Long id) {
        // 로직 구현...
        return null;
    }

    @Override
    public Member findByEmail(String email) {
        // 로직 구현...
        return null;
    }

    @Override
    public Member create(Member member) {
        // 로직 구현...
        return null;
    }

    @Override
    public void changePassword(PasswordChangeRequest dto) {
        // 로직 구현...
    }

    @Override
    public Member updateName(Long id, String name) {
        // 로직 구현...
        return null;
    }
}