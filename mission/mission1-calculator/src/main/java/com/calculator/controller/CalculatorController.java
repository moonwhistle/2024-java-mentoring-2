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

        int firstOperand = inputView.firstOperand();
        int secondOperand = inputView.secondOperand();

        outputView.printResult(calculator.add(firstOperand, secondOperand));
        outputView.printResult(calculator.subtract(firstOperand, secondOperand));
        outputView.printResult(calculator.multiply(firstOperand, secondOperand));
        outputView.printResult(calculator.divide(firstOperand, secondOperand));
    }
}
