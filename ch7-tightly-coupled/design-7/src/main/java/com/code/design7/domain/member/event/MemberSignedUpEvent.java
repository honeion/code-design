package com.code.design7.domain.member.event;

import com.code.design7.domain.member.domain.Member;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class MemberSignedUpEvent {
    private final Member member;
}
