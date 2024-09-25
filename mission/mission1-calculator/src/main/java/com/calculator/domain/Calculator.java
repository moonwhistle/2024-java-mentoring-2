package com.calculator.domain;

public class Calculator {
    private static final int NUM_ZERO = 0;
    public int add(int num1, int num2){
        return num1 + num2;
    }

    public int subtract(int num1, int num2){
        return num1 - num2;
    }

    public int multiple(int num1 , int num2){
        return num1 * num2;
    }

    public int divide(int num1, int num2){
        if(num2 == NUM_ZERO){
            throw new ArithmeticException("0으로 나눌 수 없음");
        }
        return num1 / num2;
    }
}
