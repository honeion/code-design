package com.code.design6.domain.order.api;


import com.code.design6.domain.order.domain.Order;
import com.code.design6.domain.order.message.MessageType;
import com.code.design6.domain.order.message.OrderMessage;
import lombok.Getter;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Set;

@RestController
@RequestMapping("/orders")
public class OrderApi {


    @PostMapping
    public Order create(@RequestBody @Valid OrderRequest request) {
        final Order order = new Order(OrderMessage.of(request.getMessageType()));

        return order;
    }

    @Getter
    public static class OrderRequest {

        @NotNull
        private Set<MessageType> messageType;
    }
}
