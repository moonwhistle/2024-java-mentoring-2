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
        Calculator calculator = new Calculator();
        int expected = 5;

        //when
        int result = calculator.add(firstOperand, secondOperand);

        //then
        Assertions.assertEquals(expected, result);
    }

    @Test
    @DisplayName("뺄셈 테스트")
    void subtractTest() {

        //given
        int firstOperand = 5;
        int secondOperand = 0;
        Calculator calculator = new Calculator();
        int expected = 5;

        //when
        int result = calculator.subtract(firstOperand, secondOperand);

        //then
        Assertions.assertEquals(expected, result);
    }

    @Test
    @DisplayName("곱셈 테스트")
    void multiplyTest() {

        //given
        int firstOperand = 5;
        int secondOperand = 0;
        Calculator calculator = new Calculator();
        int expected = 0;

        //when
        int result = calculator.multiply(firstOperand, secondOperand);

        //then
        Assertions.assertEquals(expected, result);
    }

    @Test
    @DisplayName("나눗셈 테스트")
    void divideTest() {

        //given
        int firstOperand = 5;
        int secondOperand = 1;
        Calculator calculator = new Calculator();
        int expected = 5;

        //when
        int result = calculator.divide(firstOperand, secondOperand);

        //then
        Assertions.assertEquals(expected, result);
    }

    @Test
    @DisplayName("나눗셈 예외 발생 테스트")
    void divideExceptionTest() {

        //given
        int firstOperand = 5;
        int secondOperand = 0;
        Calculator calculator = new Calculator();
        String expected = "0으로 나눌 수 없습니다.";

        //when & then
        ArithmeticException arithmeticException =
                Assertions.assertThrows(ArithmeticException.class,() -> calculator.divide(firstOperand, secondOperand));
        Assertions.assertEquals(expected, arithmeticException.getMessage());
    }
}
