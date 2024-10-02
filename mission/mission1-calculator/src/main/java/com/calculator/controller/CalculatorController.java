package com.calculator.controller;

import com.calculator.domain.Calculator;
import com.calculator.view.*;

public class CalculatorController {

    private final InputView inputview;
    private final OutputView outputview;
    private final Calculator calculator;

    public CalculatorController() {
        this.inputview = new InputView();
        this.outputview = new OutputView();
        this.calculator = new Calculator();
    }

    public void calculateNumbers(){
        int firstNumber = inputview.firstNumber();
        int secondNumber = inputview.secondNumber();

        int sumResult = calculator.sum(firstNumber, secondNumber);
        int subtractResult = calculator.subtract(firstNumber, secondNumber);
        int multiplyResult = calculator.multiply(firstNumber, secondNumber);
        int divideResult = calculator.divide(firstNumber, secondNumber);

        outputview.result(sumResult);
        outputview.result(subtractResult);
        outputview.result(multiplyResult);
        outputview.result(divideResult);
    }

}
