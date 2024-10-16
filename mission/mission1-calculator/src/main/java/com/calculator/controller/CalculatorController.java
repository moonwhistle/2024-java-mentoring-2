package com.calculator.controller;

import com.calculator.domain.Calculator;

import com.calculator.domain.SeparatorCalculator;
import com.calculator.view.InputView;
import com.calculator.view.OutputView;

public class CalculatorController {

    private final InputView inputView;
    private final OutputView outputView;
    private final SeparatorCalculator separatorCalculator;

    public CalculatorController() {
        this.inputView = new InputView();
        this.outputView = new OutputView();
        this.separatorCalculator = new SeparatorCalculator();
    }

    public void run() {
        String text = inputView.inputSeparator();

        String separator = separatorCalculator.selectSeparator(text);
        String numberText = separatorCalculator.numberText(text);

        outputView.result(separatorCalculator.calculatorSum(numberText,separator));

    }

}
