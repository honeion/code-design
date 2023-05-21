package com.code.design7.domain.coupon.repository;

import com.code.design7.domain.coupon.domain.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CouponRepository extends JpaRepository<Coupon, Long> {

}
