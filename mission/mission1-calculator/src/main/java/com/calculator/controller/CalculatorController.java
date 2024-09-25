package com.calculator.controller;

import com.calculator.view.InputView;
import com.calculator.view.OutputView;

public class CalculatorController {
    private final InputView inputView;
    private final OutputView outputView;

    public CalculatorController(InputView inputView, OutputView outputView){
        this.inputView = inputView;
        this.outputView = outputView;
    }
}
