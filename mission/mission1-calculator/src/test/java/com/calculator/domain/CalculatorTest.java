package com.calculator.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Assertions;

class CalculatorTest {

    @Test
    @DisplayName("덧셈 테스트")
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
    @DisplayName("뺄셈 테스트")
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
    @DisplayName("곱셈 테스트")
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
    @DisplayName("나눗셈 테스트")
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

    @Test
    @DisplayName("나눗셈 예외 발생 테스트")
    void divideExceptionTest() {
        //given
        int firstOperand = 5;
        int secondOperand = 0;
        Calculator calculator = new Calculator(firstOperand, secondOperand);
        String expected = "0으로 나눌 수 없습니다.";

        //when
        ArithmeticException arithmeticException =
                Assertions.assertThrows(ArithmeticException.class,() -> calculator.divide());

        //then
        Assertions.assertEquals(expected, arithmeticException.getMessage());
    }
}
