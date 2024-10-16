package com.calculator.domain;

public class Calculator {

    private static final int NUM_ZERO = 0;
    private static final String DIVIDED_BY_ZERO = "0으로 나눌 수 없습니다.";

    public int add(int firstOperand, int secondOperand) {
        return firstOperand + secondOperand;
    }

    public int subtract(int firstOperand, int secondOperand) {
        return firstOperand - secondOperand;
    }

    public int multiply(int firstOperand, int secondOperand) {
        return firstOperand * secondOperand;
    }

    public int divide(int firstOperand, int secondOperand) {
        if (secondOperand == NUM_ZERO) throw new ArithmeticException(DIVIDED_BY_ZERO);
        return firstOperand / secondOperand;
    }
}
