package com.calculator.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class CalculatorTest {

    @Test
    void addTest() {
        //given
        int firstOperand = 5;
        int secondOperand = 0;
        Calculator calculator = new Calculator(firstOperand, secondOperand);
        int expected = 5;

        //when
        int result = calculator.add();

        //then
        Assertions.assertEquals(expected, result);
    }

    @Test
    void subtractTest() {
        //given
        int firstOperand = 5;
        int secondOperand = 0;
        Calculator calculator = new Calculator(firstOperand, secondOperand);
        int expected = 5;

        //when
        int result = calculator.subtract();

        //then
        Assertions.assertEquals(expected, result);
    }

    @Test
    void multiplyTest() {
        //given
        int firstOperand = 5;
        int secondOperand = 0;
        Calculator calculator = new Calculator(firstOperand, secondOperand);
        int expected = 0;

        //when
        int result = calculator.multiply();

        //then
        Assertions.assertEquals(expected, result);
    }

    @Test
    void divideTest() {
        //given
        int firstOperand = 5;
        int secondOperand = 1;
        Calculator calculator = new Calculator(firstOperand, secondOperand);
        int expected = 5;

        //when
        int result = calculator.divide();

        //then
        Assertions.assertEquals(expected, result);
    }
}
