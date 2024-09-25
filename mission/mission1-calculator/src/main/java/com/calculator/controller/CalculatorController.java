package com.calculator.controller;

import com.calculator.domain.StringCalculator;
import com.calculator.view.InputView;
import com.calculator.view.OutputView;

import java.util.List;

public class CalculatorController {
    private final InputView inputView;
    private final OutputView outputView;

    public CalculatorController(InputView inputView, OutputView outputView){
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void startCalculate(){
        final StringCalculator stringCalculator = new StringCalculator(inputView.input());
        List<String> strList = stringCalculator.stringList();
        List<Integer> integerList = stringCalculator.StringToNum(strList);
        int result = stringCalculator.addNum(integerList);
        outputView.printResult(result);
    }
}
