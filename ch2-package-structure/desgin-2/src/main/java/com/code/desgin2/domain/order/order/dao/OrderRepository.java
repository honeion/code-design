package com.code.desgin2.domain.order.order.dao;

import com.code.desgin2.domain.order.order.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}