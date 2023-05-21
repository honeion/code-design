package com.code.design6.domain.member.repository;

import com.code.design6.domain.member.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {

    public Member findByEmail(String email);

}
