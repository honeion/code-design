package com.code.design7.domain.member.api;

import com.code.design7.domain.member.domain.Member;
import com.code.design7.domain.member.dto.MemberSignUpRequest;
import com.code.design7.domain.member.repository.MemberRepository;
import com.code.design7.domain.member.service.MemberSignUpService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/members")
@RequiredArgsConstructor
public class MemberApi {

    private final MemberSignUpService memberSignUpService;
    private final MemberRepository memberRepository;

    @GetMapping
    public List<Member> getMembers(){
        return memberRepository.findAll();
    }

    @PostMapping
    public void signUp(@RequestBody MemberSignUpRequest dto) {
        memberSignUpService.signUp(dto);
    }
}

