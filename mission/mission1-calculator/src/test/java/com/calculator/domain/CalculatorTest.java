package com.calculator.domain;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


public class CalculatorTest {

    private static int firstNumber = 7;
    private static int secondNumber = 4;

    @Test
    public void plusMethod() {
        Calculator calculator = new Calculator();

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

        Calculator calculator = new Calculator();

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

        Calculator calculator = new Calculator();

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

        Calculator calculator = new Calculator();

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

        Calculator calculator = new Calculator();

        int firstNumber = 7;
        int secondNumber = 0;
        Assertions.assertThrows(RuntimeException.class, ()->{
            calculator.divideNumber(firstNumber,secondNumber);
        });
    }
}
