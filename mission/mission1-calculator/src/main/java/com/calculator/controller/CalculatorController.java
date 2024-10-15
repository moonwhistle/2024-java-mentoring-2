package com.calculator.controller;

import com.calculator.domain.BasicCalculator;

import com.calculator.view.InputView;
import com.calculator.view.OutputView;

public class CalculatorController {

    private final InputView inputView;
    private final OutputView outputView;

    public CalculatorController(){
        this.inputView = new InputView();
        this.outputView = new OutputView();
    }

    public void processBasicCalculate(){

        final int value1 = Integer.parseInt(inputView.input());
        final int value2 = Integer.parseInt(inputView.input());

        BasicCalculator basicCalculator = new BasicCalculator();
        outputView.printValue(basicCalculator.getAdd(value1, value2));
        outputView.printValue(basicCalculator.getMinus(value1, value2));
        outputView.printValue(basicCalculator.getMultiply(value1, value2));
        outputView.printValue(basicCalculator.getDivide(value1, value2));
    }
}
