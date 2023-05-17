package com.code.design4.domain.member.dao;

import com.code.design4.domain.member.dto.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {

}
