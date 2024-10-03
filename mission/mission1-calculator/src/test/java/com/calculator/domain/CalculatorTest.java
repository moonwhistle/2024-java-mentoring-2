package com.calculator.domain;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


public class CalculatorTest {

    private static final int firstNumber = 7;
    private static final int secondNumber = 4;

    @Test
    public void plusMethod() {

        //given
        Calculator calculator = new Calculator();
        int expectedResult = 11;
        int differenceResult = 4;

        //when
        int result = calculator.addNumber(firstNumber, secondNumber);

        //then
        Assertions.assertAll(
                () -> assertEquals(expectedResult, result),
                () -> assertNotEquals(differenceResult, result)
        );
    }

    @Test
    public void subtractMethod() {

        //given
        Calculator calculator = new Calculator();
        int expectedResult = 3;
        int differenceResult = 1;

        //when
        int result = calculator.subtractNumber(firstNumber, secondNumber);

        //then
        Assertions.assertAll(
                () -> assertEquals(expectedResult,result),
                () -> assertNotEquals(differenceResult, result)
        );
    }

    @Test
    public void multiplyMethod() {

        //given
        Calculator calculator = new Calculator();
        int expectedResult = 28;
        int differenceResult = 17;

        //when
        int result = calculator.multiplyNumber(firstNumber, secondNumber);

        //then
        Assertions.assertAll(
                () -> assertEquals(expectedResult,result),
                () -> assertNotEquals(differenceResult, result)
        );
    }

    @Test
    public void divideMethod() {

        //given
        Calculator calculator = new Calculator();
        int expectedResult = 1;
        int differenceResult = 4;

        //when
        int result = calculator.divideNumber(firstNumber, secondNumber);

        //then
        Assertions.assertAll(
                () -> assertEquals(expectedResult,result),
                () -> assertNotEquals(differenceResult, result)
        );
    }
    @Test
    public void divideExceptionMethod() {

        //given
        Calculator calculator = new Calculator();
        int firstNumber = 7;
        int secondNumber = 0;

        //when&then
        Assertions.assertThrows(RuntimeException.class, ()->{
            calculator.divideNumber(firstNumber,secondNumber);
        });
    }
}
