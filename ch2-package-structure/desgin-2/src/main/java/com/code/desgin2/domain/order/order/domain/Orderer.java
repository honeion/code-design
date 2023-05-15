package com.code.desgin2.domain.order.order.domain;

import javax.persistence.Embeddable;
import lombok.Getter;

@Embeddable
@Getter
public class Orderer {

    private Long id;
    private String name;
}
