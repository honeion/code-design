package com.code.design7.domain.order.event;

import com.code.design7.domain.cart.service.CartService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class OrderEventHandler {

    private final CartService cartService;

    // 비동기적 해결이 필요, @Async 넣어주고 메인에서 @EnableAsync 필요
    @Async
    @EventListener
    public void orderCompletedEventListener(OrderCompletedEvent event) {
        cartService.deleteCart(event.getOrder());
    }

}