package com.calculator.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


class CalculatorTest {

    @Test
    public void sumTest() {

        //given
        int firstNumber = 1;
        int secondNumber = 2;
        int expectedSum = 3;
        int differentSum = 4;

        //when
        Calculator calculator = new Calculator();
        int actualSum = calculator.sum(firstNumber, secondNumber);

        //then
        Assertions.assertAll(
                () -> assertEquals(expectedSum, actualSum),
                () -> assertNotEquals(differentSum, actualSum)
        );

    }

    @Test
        public void subtractTest() {

            //given
            int firstNumber = 9;
            int secondNumber = 5;
            int expectedSubtract = 4;
            int differentSubtract = 3;

            //when
            Calculator calculator = new Calculator();
            int actualSubtract = calculator.subtract(firstNumber, secondNumber);

            //then
            Assertions.assertAll(
                    () -> assertEquals(expectedSubtract, actualSubtract),
                    () -> assertNotEquals(differentSubtract, actualSubtract)
            );

        }

    @Test
        public void multiplyTest() {

            //given
            int firstNumber = 2;
            int secondNumber = 7;
            int expectedMultiply = 14;
            int differentMultiply = 15;

            //when
            Calculator calculator = new Calculator();
            int actualMultiply = calculator.multiply(firstNumber, secondNumber);

            //then
            assertAll(
                    () -> assertEquals(expectedMultiply, actualMultiply),
                    () -> assertNotEquals(differentMultiply, actualMultiply)
            );

        }

    @Test
    public void divideTest() {

        //given
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedDivide = 2;
        int differentDivide = 3;

        //when
        Calculator calculator = new Calculator();
        int actualDivide = calculator.divide(firstNumber, secondNumber);

        //then
        assertAll(
                () -> assertEquals(expectedDivide, actualDivide),
                () -> assertNotEquals(differentDivide, actualDivide)
        );

    }

    @Test
    public void divideExceptionZeroTest() {

        //given
        int firstNumber = 10;
        int secondNumber = 0;
        String expectedExceptionMessage = "0으로 나눌 수 없습니다.";

        //when
        Calculator calculator = new Calculator();
        RuntimeException actualExceptionMessage = Assertions.assertThrows(RuntimeException.class, () -> {
            calculator.divide(firstNumber, secondNumber);
        });

        //then
        assertEquals(expectedExceptionMessage, actualExceptionMessage.getMessage());

    }

}
