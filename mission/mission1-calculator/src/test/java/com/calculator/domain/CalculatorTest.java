package com.calculator.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    Calculator calculator = new Calculator();
    int testFirstNumber = 3;
    int testSecondNumber = 5;
    @Test
    void plusTest(){
        int result = calculator.addCalculator(testFirstNumber,testSecondNumber);
        int expect = 8;

        assertEquals(result, expect);

    }

    @Test
    void subtractionTest(){
        int result = calculator.subCalculator(testFirstNumber,testSecondNumber);
        int expect = -2;

        assertEquals(result, expect);

    }

    @Test
    void multiplyTest(){
        int result = calculator.mulCalculator(testFirstNumber,testSecondNumber);
        int expect = 15;

        assertEquals(result, expect);

    }

    @Test
    void divideTest(){
        int result = calculator.divCalculator(testFirstNumber,testSecondNumber);
        int expect = 0;

        assertEquals(result, expect);

    }
}