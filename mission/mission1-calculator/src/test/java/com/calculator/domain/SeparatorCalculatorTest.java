package com.calculator.domain;
import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class SeparatorCalculatorTest {
    @Test
    public void sumTest() {
        //given
        String text = "1,2,3,4,5,6,7,8,9";
        String separator = ",";
        int expectedSum = 45;
        //when
        SeparatorCalculator separatorcalculator = new SeparatorCalculator();
        int sum = separatorcalculator.calculatorSum(text, separator);
        //then
        assertEquals(expectedSum, sum);
    }

    @Test
    public void extractSeparatorTest() {
        //given
        String text = "//;\n1,2,3,4,5,6,7,8,9";
        String expectedResult = ";";
        String differentResult = ",";
        //when
        SeparatorCalculator separatorcalculator = new SeparatorCalculator();
        String result = separatorcalculator.extractSeparator(text);
        //then
        Assertions.assertAll(
                () -> assertEquals(expectedResult, result),
                () -> assertNotEquals(differentResult, result)
        );
    }
    @Test
    public void extractNumberTest() {
        //given
        String text = "//;\n1,2,3,4,5,6,7,8,9";
        String expectedResult = "1,2,3,4,5,6,7,8,9";
        String differentResult = "\n1,2,3,4,5,6,7,8,9";
        //when
        SeparatorCalculator separatorcalculator = new SeparatorCalculator();
        String result = separatorcalculator.extractNumber(text);
        //then
        Assertions.assertAll(
                () -> assertEquals(expectedResult, result),
                () -> assertNotEquals(differentResult, result)
        );
    }

    @Test
    public void calculateTest() {
        //given
        String text = "//;\n1,2,3,4,5,6,7,8,9";
        int expectedResult = 45;
        int differentResult = 5;
        //when
        SeparatorCalculator separatorcalculator = new SeparatorCalculator();
        int result = separatorcalculator.separatorCalculate(text,);
        //then
    }

}