package com.calculator.domain;

public class Calculator {

    private static final String EXCEPTION_STRING = "0은 입력 처리하지못합니다.";

    private static final int INT = 0;

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
        if (secondNumber == INT) {
            throw new RuntimeException(EXCEPTION_STRING);
        }
        return firstNumber / secondNumber;
    }

}
