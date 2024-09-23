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
}
