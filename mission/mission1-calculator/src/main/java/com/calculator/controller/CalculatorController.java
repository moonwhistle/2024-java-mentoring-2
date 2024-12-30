package com.calculator.controller;

import com.calculator.domain.Calculator;

import com.calculator.view.InputView;
import com.calculator.view.OutputView;

public class CalculatorController {

    public void run(){
        InputView inputView = new InputView();

        int firstNumber = inputView.firstNumber();
        int secondNumber = inputView.secondNumber();

        Calculator calculator = new Calculator();

        int addResult = calculator.addCalculator(firstNumber, secondNumber);
        int subResult = calculator.subCalculator(firstNumber, secondNumber);
        int mulResult = calculator.mulCalculator(firstNumber, secondNumber);
        int divResult = calculator.divCalculator(firstNumber, secondNumber);

        OutputView outputView = new OutputView();

        outputView.outputView(addResult);
        outputView.outputView(subResult);
        outputView.outputView(mulResult);
        outputView.outputView(divResult);
    }
}
