package com.code.design7.domain.order.event;

import com.code.design7.domain.order.domain.Order;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class OrderCompletedEvent {

    private final Order order;

    public Order getOrder() {
        return this.order;
    }
}
