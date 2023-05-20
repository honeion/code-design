package com.code.design6.domain.order.domain;

import com.code.design6.domain.order.message.OrderMessage;
import lombok.Getter;

@Getter
public class Order {

    private OrderMessage message;

    public Order(OrderMessage orderMessage) {
        this.message = orderMessage;
    }
}
