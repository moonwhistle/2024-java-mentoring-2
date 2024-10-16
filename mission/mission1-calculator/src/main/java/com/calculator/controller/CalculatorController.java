package com.calculator.controller;

import com.calculator.domain.Calculator;

import com.calculator.view.InputView;
import com.calculator.view.OutputView;

public class CalculatorController {

    private final InputView inputView;
    private final OutputView outputView;

    private final Calculator calculator;

    public CalculatorController(InputView inputView, OutputView outputView, Calculator calculator) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.calculator = calculator;
    }

    public void controllerStart() {
        int firstOperand = inputView.firstOperand();
        int secondOperand = inputView.secondOperand();
        outputView.printResult(calculator.add(firstOperand, secondOperand));
        outputView.printResult(calculator.subtract(firstOperand, secondOperand));
        outputView.printResult(calculator.multiply(firstOperand, secondOperand));
        outputView.printResult(calculator.divide(firstOperand, secondOperand));
    }
}
