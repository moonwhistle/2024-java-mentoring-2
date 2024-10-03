package com.calculator.domain;

public class Calculator {

    private static final String EXCEPTION_STRING = "NOT ZERO";

    private static final int ZERO = 0;

    public int addNumber(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int subtractNumber(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int multiplyNumber(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public int divideNumber(int firstNumber, int secondNumber) {
        return divideExceptionZeroNumber(firstNumber, secondNumber);
    }

    private int divideExceptionZeroNumber(int firstNumber, int secondNumber) {
        if (secondNumber == ZERO) {
            throw new RuntimeException(EXCEPTION_STRING);
        }
        return firstNumber / secondNumber;
    }

}
