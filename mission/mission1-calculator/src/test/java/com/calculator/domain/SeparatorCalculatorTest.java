package com.calculator.domain;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

class SeparatorCalculatorTest {

    @Test
    public void 커스텀_구분자_테스트() {

        //given
        String text = "//'\n1'2'3'4'5'6'7'8'9";
        String expectedResult = "'";
        String differentResult = ".";

        //when
        SeparatorCalculator separatorCalculator = new SeparatorCalculator();
        String result = separatorCalculator.selectSeparator(text);

        //then
        Assertions.assertAll(
                () -> assertEquals(expectedResult, result),
                () -> assertNotEquals(differentResult, result)
        );
    }

    @Test
    public void 숫자부분_문자열_테스트() {

        //given
        String text = "//:\n1:2:3:4:5:6:7:8:9";
        String expectedResult = "1:2:3:4:5:6:7:8:9";
        String differentResult = "1,2,3,4,5,6,7,8,9";

        //when
        SeparatorCalculator separatorCalculator = new SeparatorCalculator();
        String result = separatorCalculator.numberText(text);

        //then
        Assertions.assertAll(
                () -> assertEquals(expectedResult, result),
                () -> assertNotEquals(differentResult, result)
        );
    }
    @Test
    public void 음수_예외처리_테스트() {

        //given
        String text = "1!2!3!-4!5!6!7!8!9";
        String separator = "!";
        String expectedResult = "숫자가 음수입니다.";
        int differentResult = 41;

        //when
        SeparatorCalculator separatorCalculator = new SeparatorCalculator();
        int result = separatorCalculator.calculatorSum(text,separator);

        //then
        Assertions.assertAll(
                () -> assertEquals(expectedResult, result),
                () -> assertNotEquals(differentResult, result)
        );
    }

    @Test
    public void calculateTest() {

        //given
        String text = "1,2,3,4,5,6,7,8,9";
        String separator = ",";
        int expectedResult = 45;
        int differentResult = 5;

        //when
        SeparatorCalculator separatorCalculator = new SeparatorCalculator();
        int result = separatorCalculator.calculatorSum(text,separator);

        //then
        System.out.println(result);
        Assertions.assertAll(
                () -> assertEquals(expectedResult, result),
                () -> assertNotEquals(differentResult, result)
        );
    }

}
