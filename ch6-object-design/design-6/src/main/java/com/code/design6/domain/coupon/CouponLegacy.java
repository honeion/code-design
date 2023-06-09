package com.code.design6.domain.coupon;


import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class CouponLegacy {

    private long id;

    private boolean used;

    private double amount;

    private LocalDate expirationDate;

    public CouponLegacy(double amount, LocalDate expirationDate) {
        this.amount = amount;
        this.expirationDate = expirationDate;
        this.used = false;
    }
}
