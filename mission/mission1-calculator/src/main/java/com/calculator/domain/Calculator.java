package com.calculator.domain;

public class Calculator {

    private final int firstOperand;
    private final int secondOperand;

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
        if (secondOperand == 0) throw new ArithmeticException("0으로 나눌 수 없습니다.");
        return firstOperand / secondOperand;
    }
}
