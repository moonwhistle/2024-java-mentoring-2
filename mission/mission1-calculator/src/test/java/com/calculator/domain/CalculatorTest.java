package com.calculator.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private final Calculator calculator;
    private static int firstNumber = 7;
    private static int secondNumber = 4;

    public CalculatorTest() {
        calculator = new Calculator();
    }

    @BeforeEach
    void setUp() {
        Calculator calculator = new Calculator();
    }

    @Test
    public void plusMethod() {

        int expectedResult = 11;
        int differenceResult = 4;

        int result = calculator.addNumber(firstNumber, secondNumber);

        Assertions.assertAll(
                () -> assertEquals(expectedResult, result),
                () -> assertNotEquals(differenceResult, result)
        );
    }

    @Test
    public void subtractMethod() {

        int expectedResult = 3;
        int differenceResult = 1;

        int result = calculator.subtractNumber(firstNumber, secondNumber);

        Assertions.assertAll(
                () -> assertEquals(expectedResult,result),
                () -> assertNotEquals(differenceResult, result)
        );
    }

    @Test
    public void multiplyMethod() {

        int expectedResult = 28;
        int differenceResult = 17;

        int result = calculator.multiplyNumber(firstNumber, secondNumber);

        Assertions.assertAll(
                () -> assertEquals(expectedResult,result),
                () -> assertNotEquals(differenceResult, result)
        );
    }

    @Test
    public void divideMethod() {

        int expectedResult = 1;
        int differenceResult = 4;

        int result = calculator.divideNumber(firstNumber, secondNumber);

        Assertions.assertAll(
                () -> assertEquals(expectedResult,result),
                () -> assertNotEquals(differenceResult, result)
        );
    }
    @Test
    public void divideExceptionMethod() {

        int firstNumber = 7;
        int secondNumber = 0;
        String expectedResult = "0으로 나누지 못 함";
        int differenceResult = 0;

        int result = calculator.divideNumber(firstNumber, secondNumber);

        Assertions.assertAll(
                () -> assertEquals(expectedResult,result),
                () -> assertNotEquals(differenceResult, result)
        );
    }
}
