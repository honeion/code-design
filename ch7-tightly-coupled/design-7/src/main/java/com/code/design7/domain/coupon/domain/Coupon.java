package com.code.design7.domain.coupon.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "coupon")
@Getter
@NoArgsConstructor
public class Coupon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "amount", nullable = false)
    private BigDecimal amount;

    @Column(name = "member_id", nullable = false, updatable = false)
    private Long memberId;

    public Coupon(BigDecimal amount, Long memberId) {
        this.amount = amount;
        this.memberId = memberId;
    }
}
