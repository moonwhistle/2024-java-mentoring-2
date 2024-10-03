package com.calculator.controller;

import com.calculator.domain.Calculator;

import com.calculator.view.InputView;
import com.calculator.view.OutputView;

public class CalculatorController {

    private final InputView inputView;
    private final OutputView outputView;
    private final Calculator calculator;

    public CalculatorController() {
        this.inputView = new InputView();
        this.outputView = new OutputView();
        this.calculator = new Calculator();
    }

    public void run() {
        int firstNumber = inputView.firstNumber();
        int secondNumber = inputView.secondNumber();

        outputView.result(calculator.addNumber(firstNumber, secondNumber));
        outputView.result(calculator.subtractNumber(firstNumber, secondNumber));
        outputView.result(calculator.multiplyNumber(firstNumber, secondNumber));
        outputView.result(calculator.divideNumber(firstNumber, secondNumber));
    }

}
