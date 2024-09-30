package com.calculator.domain;

public class Calculator {

    public String addNumber(int firstNumber, int secondNumber) {
        return  Integer.toString(firstNumber + secondNumber);
    }

    public String subtractNumber(int firstNumber, int secondNumber) {
        return Integer.toString(firstNumber - secondNumber);
    }

    public String multiplyNumber(int firstNumber, int secondNumber) {
        return Integer.toString(firstNumber * secondNumber);
    }

    public String divideNumber(int firstNumber, int secondNumber) {
        if(secondNumber == 0){
            return "오류발생";
        }
        else {
            String divide = Integer.toString(firstNumber / secondNumber);
            return divide;
        }
    }

}