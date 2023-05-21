package com.code.design7.domain.order.dto;

import com.code.design7.domain.order.domain.Order;
import com.code.design7.domain.order.domain.Orderer;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
public class OrderRequest {

    private BigDecimal productAmount;
    private Long productId;
    private Orderer orderer;

    public Order toEntity() {
        return new Order(productId, productAmount, orderer);
    }
}
