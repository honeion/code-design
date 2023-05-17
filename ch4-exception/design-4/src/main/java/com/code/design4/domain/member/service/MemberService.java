package com.code.design4.domain.member.service;

import com.code.design4.domain.member.dao.MemberRepository;
import com.code.design4.domain.member.dto.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;

@Service
@RequiredArgsConstructor
@Transactional
public class MemberService {

    private final MemberRepository memberRepository;

    public Member createUncheckedException() {
        final Member member = memberRepository.save(new Member("yun"));
        if (true) {
            throw new RuntimeException();
        }
        return member;
    }

    public Member createCheckedException() throws IOException {
        final Member member = memberRepository.save(new Member("wan"));
        if (true) {
            throw new IOException();
        }
        return member;
    }

    public Member findById(long id) {
        return memberRepository.findById(id).get();
    }

}