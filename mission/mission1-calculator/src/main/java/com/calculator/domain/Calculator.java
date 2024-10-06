package com.calculator.domain;

public class Calculator {

    private static final int EXCEPTION_ZERO = 0;

    private static final String EXCEPTION_STRING = "0으로 나눌 수 없습니다.";

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
        if (secondNumber == EXCEPTION_ZERO) {
            throw new RuntimeException(EXCEPTION_STRING);
        }
        return firstNumber / secondNumber;
    }

}
