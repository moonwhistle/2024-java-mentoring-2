package com.calculator.controller;

import com.calculator.domain.StringCalculator;
import com.calculator.view.InputView;
import com.calculator.view.OutputView;

public class StringCalculatorController {

    private final InputView inputView;
    private final OutputView outputView;

    public StringCalculatorController(){
        this.inputView = new InputView();
        this.outputView = new OutputView();
    }

    public void processStringCalculator() {

        StringCalculator stringCalculator = new StringCalculator();

        String inputValue = inputView.input();

        int sum = stringCalculator.processInputValue(inputValue);

        outputView.printValue(sum);
    }
}
