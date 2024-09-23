package com.calculator.controller;

import com.calculator.domain.Calculator;
import com.calculator.view.InputView;
import com.calculator.view.OutputView;

public class CalculatorController {
    private final InputView inputView;
    private final OutputView outputView;

    public CalculatorController(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void controllerStart() {
        Calculator calculator = new Calculator();

        int firstNumber = inputView.firstNumber();
        int secondNumber = inputView.secondNumber();

        outputView.print(calculator.add(firstNumber, secondNumber));
        outputView.print(calculator.subtract(firstNumber, secondNumber));
        outputView.print(calculator.multiply(firstNumber, secondNumber));
        outputView.print(calculator.divide(firstNumber, secondNumber));
    }
}