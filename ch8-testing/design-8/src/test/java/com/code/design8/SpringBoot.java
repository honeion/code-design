package com.code.design8;

import com.code.design8.domain.member.Member;
import com.code.design8.domain.member.MemberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestConstructor;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;

import static org.assertj.core.api.BDDAssertions.then;

@TestConstructor(autowireMode = TestConstructor.AutowireMode.ALL)
@ActiveProfiles("test")
@DataJpaTest
public class SpringBoot {

    private final MemberRepository memberRepository;

    public SpringBoot(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Test
    public void member_test() {
        final Member member = memberRepository.save(new Member("name"));
    }

    @Test
    @Sql("/member-set-up.sql")
    public void sql_test() {
        final List<Member> members = memberRepository.findAll();
        then(members).hasSize(7);
    }
}
