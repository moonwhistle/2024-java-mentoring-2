package com.calculator;

import com.calculator.controller.CalculatorController;
import com.calculator.domain.StringCalculator;
import com.calculator.view.InputView;
import com.calculator.view.OutputView;

public class CalculatorApplication {

    public static void main(String[] args) {

        CalculatorController calculatorController = new CalculatorController(new StringCalculator(), new InputView(), new OutputView());

        calculatorController.calculatorControl();
    }
}
