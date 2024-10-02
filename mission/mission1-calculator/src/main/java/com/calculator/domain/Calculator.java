package com.calculator.domain;

public class Calculator {

    private static final int INT = 0;

    private static final String EXCEPTION_STRING = "0은예외처리";

    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int subtract(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int multiply(int fistNumber, int secondNumber) {
        return fistNumber * secondNumber;
    }

    public int divide(int firstNumber, int secondNumber) {
        return divideExceptionZeroNumber(firstNumber, secondNumber);
    }

    private int divideExceptionZeroNumber(int firstNumber, int secondNumber) {
        if (secondNumber == INT) {
            throw new RuntimeException(EXCEPTION_STRING);
        }
        return firstNumber / secondNumber;
    }

}
