package com.calculator.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StringCalculatorTest {

    StringCalculator stringCalculator = new StringCalculator();

    @BeforeEach
    void setUp() {
        stringCalculator = new StringCalculator();
    }

    @Test
    void 구분자반환테스트() {

        //given
        String message = "1:2,3:4";
        String expected = "[,:]";

        //when
        String result = stringCalculator.getSeparator(message);

        //then
        Assertions.assertEquals(expected, result);
    }
}
