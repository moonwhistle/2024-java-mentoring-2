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
        int firstOperand = inputView.firstOperand();
        int secondOperand = inputView.secondOperand();
        Calculator calculator = new Calculator(firstOperand, secondOperand);
        outputView.printResult(calculator.add());
        outputView.printResult(calculator.subtract());
        outputView.printResult(calculator.multiply());
        outputView.printResult(calculator.divide());
    }
}
