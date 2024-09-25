package com.calculator;

import com.calculator.controller.CalculatorController;
import com.calculator.view.InputView;
import com.calculator.view.OutputView;

public class CalculatorApplication {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();

        CalculatorController Controller = new CalculatorController(inputView, outputView);
        Controller.startCalculate();
    }
}
