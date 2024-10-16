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

    @Test
    void 커스텀구분자반환테스트() {

        //given
        String message = "//;\n1;2;3;4";
        String expected = ";";

        //when
        String result = stringCalculator.getSeparator(message);

        //then
        Assertions.assertEquals(expected, result);
    }

    @Test
    void 구분문자열반환테스트() {

        //given
        String message = "1:2:3:4";
        String expected = "1:2:3:4";

        //when
        String result = stringCalculator.getMessage(message);

        //then
        Assertions.assertEquals(expected, result);
    }

    @Test
    void 커스텀문자열반환테스트() {

        //given
        String message = "//;\n1;2;3;4";
        String expected = "1;2;3;4";

        //when
        String result = stringCalculator.getMessage(message);

        //then
        Assertions.assertEquals(expected, result);
    }

    @Test
    void 문자열분리테스트() {

        //given
        String message = "1:2:3:4";
        String separator = ":";
        String[] expected = {"1", "2", "3", "4"};

        //when
        String[] result = stringCalculator.separate(message, separator);

        //then
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    void 커스텀문자열분리테스트() {

        //given
        String message = "//;\n1;2;3;4";
        String separator = ";";
        String[] expected = {"1", "2", "3", "4"};

        //when
        String[] result = stringCalculator.separate(stringCalculator.getMessage(message), separator);

        //then
        Assertions.assertArrayEquals(expected, result);
    }
}
