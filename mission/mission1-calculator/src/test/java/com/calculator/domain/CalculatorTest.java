package com.calculator.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {
    private Calculator calculator;
    private int firstNumber;
    private int secondNumber;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
        firstNumber = 7;
        secondNumber = 3;
    }

    @Test
    @DisplayName("더하기 테스트")
    void addTest() {
        int expectedResult = calculator.add(firstNumber, secondNumber);
        int actualResult = firstNumber + secondNumber;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("빼기 테스트")
    void subtractTest() {
        int expectedResult = calculator.subtract(firstNumber, secondNumber);
        int actualResult = firstNumber - secondNumber;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void multiplyTest() {
    }

    @Test
    void divideTest() {
    }
}
