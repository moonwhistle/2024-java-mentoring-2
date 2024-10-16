package com.calculator;

import com.calculator.view.InputView;
import com.calculator.view.OutputView;

import com.calculator.domain.Calculator;
import com.calculator.domain.StringCalculator;

import com.calculator.controller.CalculatorController;

public class CalculatorApplication {

    public static void main(String[] args) {
        CalculatorController calculatorController = new CalculatorController(new InputView(), new OutputView(), new Calculator(), new StringCalculator());
        calculatorController.stringControllerStart();
    }
}
