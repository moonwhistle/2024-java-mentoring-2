package com.calculator.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    Calculator calculator = new Calculator();
    int testFirstNumber = 3;
    int testSecondNumber = 5;
    @Test
    void plusTest(){
        int result = calculator.addCalculator(testFirstNumber,testSecondNumber);
        int testResult = testFirstNumber + testSecondNumber;

        assertEquals(result, testResult);

    }

    @Test
    void subtractionTest(){
        int result = calculator.subCalculator(testFirstNumber,testSecondNumber);
        int testResult = testFirstNumber - testSecondNumber;

        assertEquals(result, testResult);
    }

    @Test
    void multiplyTest(){
        int result = calculator.mulCalculator(testFirstNumber,testSecondNumber);
        int testResult = testFirstNumber * testSecondNumber;

        assertEquals(result, testResult);
    }

    @Test
    void divideTest(){
        int result = calculator.divCalculator(testFirstNumber,testSecondNumber);
        int testResult = testFirstNumber / testSecondNumber;

        assertEquals(result, testResult);
    }

}