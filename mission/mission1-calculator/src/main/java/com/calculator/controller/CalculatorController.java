package com.calculator.controller;

import com.calculator.domain.StringCalculator;
import com.calculator.view.InputView;
import com.calculator.view.OutputView;

import java.util.List;

public class CalculatorController {
    private final StringCalculator stringCalculator;
    private final InputView inputView;
    private final OutputView outputView;


    public CalculatorController(StringCalculator stringCalculator, InputView inputView, OutputView outputView){
        this.stringCalculator = stringCalculator;
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void calculatorControl(){

        String factor = inputView.InputString();

        String message = stringCalculator.subStringMessage(factor);
        String checkFactor = stringCalculator.checkStartString(factor);

        String[] checkedFactor = stringCalculator.regularSplitString(checkFactor,message);
        int[] argumentValue = stringCalculator.changeStringToInt(checkedFactor);
        List<Integer> list = stringCalculator.numberList(argumentValue);

        int result = stringCalculator.add(list);

        outputView.outputView(result);


    }
}
