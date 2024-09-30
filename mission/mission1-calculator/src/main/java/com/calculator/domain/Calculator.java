package com.calculator.domain;

public class Calculator {

    private final int firstOperand;
    private final int secondOperand;

    private static final String DIVIDED_BY_ZERO = "0으로 나눌 수 없습니다.";
    private static final int NUM_ZERO = 0;

    public Calculator(int firstOperand, int secondOperand) {
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
    }

    public int add() {
        return firstOperand + secondOperand;
    }

    public int subtract() {
        return firstOperand - secondOperand;
    }

    public int multiply() {
        return firstOperand * secondOperand;
    }

    public int divide() {
        if (secondOperand == NUM_ZERO ) throw new ArithmeticException(DIVIDED_BY_ZERO);
        return firstOperand / secondOperand;
    }
}
