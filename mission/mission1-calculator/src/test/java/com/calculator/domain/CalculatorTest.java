package com.calculator.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();
    int testNumber1 = 3;
    int testNumber2 = 5;

    @Test
    void plusTest() {
        int result = calculator.addCalculator(testNumber1, testNumber2);
        int testResult = testNumber1 + testNumber2;

        assertEquals(result, testResult);

    }
}