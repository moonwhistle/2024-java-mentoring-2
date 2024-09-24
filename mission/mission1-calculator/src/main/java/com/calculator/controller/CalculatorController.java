package com.calculator.controller;

import com.calculator.domain.Calculator;
import com.calculator.view.*;

public class CalculatorController {
    InputView inputview;
    OutputView outputview;
    Calculator calculator;

    public CalculatorController() {
        this.inputview = new InputView();
        this.outputview = new OutputView();
        this.calculator = new Calculator();
    }
    public void calculateNumbers(){
        int firstNumber = inputview.inputFirst_number();
        int secondNumber = inputview.inputSecond_number();

        int sumNumber = calculator.sum(firstNumber, secondNumber);
        int subtractNumber = calculator.subtract(firstNumber, secondNumber);
        int multiplicationNumber = calculator.multiply(firstNumber, secondNumber);
        int divisionNumber = calculator.divide(firstNumber, secondNumber);

        outputview.outputResult(sumNumber);
        outputview.outputResult(subtractNumber);
        outputview.outputResult(multiplicationNumber);
        outputview.outputResult(divisionNumber);
    }
}