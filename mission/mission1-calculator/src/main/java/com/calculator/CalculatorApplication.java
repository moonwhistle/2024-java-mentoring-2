package com.calculator;

import com.calculator.view.InputView;
import com.calculator.view.OutputView;

import com.calculator.domain.Calculator;

import com.calculator.controller.CalculatorController;

public class CalculatorApplication {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();
        Calculator calculator = new Calculator();
        CalculatorController calculatorController = new CalculatorController(inputView, outputView, calculator);
        calculatorController.controllerStart();
    }
}
