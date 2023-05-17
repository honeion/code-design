package com.code.desgin3;

import com.code.desgin3.lombok.Coupon;
import com.code.desgin3.lombok.Member;
import com.code.desgin3.lombok.Student;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class Desgin3ApplicationTests {

	@Test
	public void setter_남용의_문제() {
		// 우리는 회원에 대한 이메일 변경 기능을 제공하지 않는다.
		final Member member = new Member();

		// bean 방식
		//member.setEmail("asd@asd.com");
		//member.setName("name");
		// 객체 생성 완료
		// 앞으로 추가적인 이메일 변경은 불가능 해야한다.

		//member.setEmail("new@asd.com");
		//근데 이렇게 열려있으므로, Setter를 쓰지 않는 식이 오히려 낫다
		//@Data 제거했음.
	}

	@Test
	public void toString_양방향_순한_참조_문제() {
		final Member member = new Member();
		//member.setEmail("asd@asd.com");
		//member.setName("name");

		final Coupon coupon = new Coupon();
		coupon.setMember(member);

		final List<Coupon> coupons = new ArrayList<>();
		coupons.add(coupon);
		//member.setCoupons(coupons);

		System.out.println(member); // toString 순환 참조 발생, java.lang.stackoverflowError

	}

	@Test
	// Student 자기 자신의 객체가, 본인의 생성되는 플로우에서 보다 명확하게 필요한 값과 필요하지 않은 값을 구분해서 받게 한다.
	public void 클래스_상단의_Builder의_단점() {
		final Student student = Student.builder()
				.email("asd@asd.com")
				.name("asd")
				.build();

		System.out.println(student);
	}

}
