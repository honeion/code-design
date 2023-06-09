package com.code.design4.domain.member.api;

import com.code.design4.domain.member.dao.MemberRepository;
import com.code.design4.domain.member.dto.Member;
import com.code.design4.domain.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/members")
@RequiredArgsConstructor
public class MemberApi {

    private final MemberService memberService;
    private final MemberRepository memberRepository;

    @GetMapping
    public List<Member> getAll() {
        return memberRepository.findAll();
    }

    // rollback 진행 O
    @PostMapping("/unchekced")
    public Member unchekced() {
        final Member member = memberService.createUncheckedException();
        return member;
    }

    // rollback 진행 X
    @PostMapping("/chekced")
    public Member chekced() throws IOException {
        final Member member = memberService.createCheckedException();
        return member;
    }
}