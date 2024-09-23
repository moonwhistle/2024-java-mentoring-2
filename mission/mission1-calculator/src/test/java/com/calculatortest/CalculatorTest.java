package com.calculatortest;

import com.calculator.domain.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    @DisplayName("add 테스트")
    public void testAdd() {
        Calculator calculator = new Calculator();

        //given
        int firstNumber = 5;
        int secondNumber = 15;
        int expected = 20;

        //when
        int result = calculator.add(firstNumber, secondNumber);

        //then
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("subtract 테스트")
    public void testSubtract() {
        Calculator calculator = new Calculator();

        //given
        int firstNumber = 5;
        int secondNumber = 15;
        int expected = -10;

        //when
        int result = calculator.subtract(firstNumber, secondNumber);

        //then
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("multiply 테스트")
    public void testMultiply() {
        Calculator calculator = new Calculator();

        //given
        int firstNumber = 5;
        int secondNumber = 15;
        int expected = 75;

        //when
        int result = calculator.multiply(firstNumber, secondNumber);

        //then
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("divide 테스트")
    public void testDivide() {
        Calculator calculator = new Calculator();

        //given
        int firstNumber = 15;
        int secondNumber = 5;
        int expected = 3;

        //when
        int result = calculator.divide(firstNumber, secondNumber);

        //then
        assertEquals(expected, result);
    }
}
