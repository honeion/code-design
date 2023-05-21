package com.code.desgin2.domain.order.order.domain;

import com.code.desgin2.domain.model.domain.Address;
import javax.persistence.Embeddable;
import lombok.Getter;

@Embeddable
@Getter
public class Tracking {

    private Address address;
}
