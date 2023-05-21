package com.code.design6.domain.order.message;


import org.springframework.util.ObjectUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 1. 주문시 주문완료 메세지에 대한 책임을 갖는다.
 * 2. SMS, EMAIL, KAKAO
 */
public class OrderMessage {

    private String type;

    private OrderMessage(String type) {
        this.type = ObjectUtils.isEmpty(type) ? null : type;
    }

    public static OrderMessage of(Set<MessageType> types) {
        return new OrderMessage(joining(types));
    }

    public List<MessageType> getTypes() {
        if (ObjectUtils.isEmpty(type)) {
            return new ArrayList<>();
        }

        return new ArrayList<>(doSplit());
    }

    //하나의 문자열로 조합
    private static String joining(Set<MessageType> types) {
        return types.stream()
                .map(Enum::name)
                .collect(Collectors.joining(","));
    }

    private Set<MessageType> doSplit() {
        final String[] split = this.type.split(",");
        return Arrays.stream(split)
                .map(MessageType::valueOf)
                .collect(Collectors.toSet());
    }
}

