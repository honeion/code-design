package com.code.design8;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Junit5_3 {

    @Test
    @Order(2)
    void test_1() {
        System.out.println("test_1");
    }

    @Test
    @Order(1)
    void test_2() {
        System.out.println("test_2");
    }

    @Test
    @Order(99)
    void test_3() {
        System.out.println("test_3");
    }
}