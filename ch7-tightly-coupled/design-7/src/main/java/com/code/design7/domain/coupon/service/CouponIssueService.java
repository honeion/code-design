package com.code.design7.domain.coupon.service;

import com.code.design7.domain.coupon.domain.Coupon;
import com.code.design7.domain.coupon.repository.CouponRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
public class CouponIssueService {

    private final CouponRepository couponRepository;

    @Transactional
    public void issueSignUpCoupon(Long memberId) {
        couponRepository.save(new Coupon(BigDecimal.TEN, memberId));
//        throw new RuntimeException("RuntimeException....");
    }
}
