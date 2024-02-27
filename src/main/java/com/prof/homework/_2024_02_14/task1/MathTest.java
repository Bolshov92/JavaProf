package com.prof.homework._2024_02_14.task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MathTest {
    private static final Math MATH = new Math();
    private static int NUM1 = 100;
    private static int NUM2 = 3;

    @Test
    void sumTest() {
        Assertions.assertEquals(25, MATH.sum(NUM1, NUM2));
    }

    @Test
    void subtraction() {
        Assertions.assertEquals(-5, MATH.subtraction(NUM1, NUM2));
    }

    @Test
    void multiplyTest() {
        Assertions.assertEquals(150, MATH.multiply(NUM1, NUM2));
    }

    @Test
    void divideTestEx() {
        Assertions.assertThrows(ArithmeticException.class, () -> MATH.divide(NUM1, 0));
    }

    @Test
    void divideTest() {
        Assertions.assertEquals(0, MATH.divide(NUM1, NUM2));
    }

    @Test
    void power() {
        Assertions.assertEquals(1000, MATH.power(NUM1, NUM2));
    }

    @Test
    void factorial() {
        Assertions.assertEquals(120, MATH.factorial(NUM1));
    }


    @Test
    void absolute() {
        Assertions.assertEquals(5,MATH.absolute(NUM1));
    }

    @Test
    void sqrt() {
        Assertions.assertEquals(10,MATH.sqrt(NUM1));
    }
}