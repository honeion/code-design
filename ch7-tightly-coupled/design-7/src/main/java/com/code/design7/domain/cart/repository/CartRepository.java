package com.code.design7.domain.cart.repository;

import com.code.design7.domain.cart.domain.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> {
    void deleteByProductId(Long productId);
}
