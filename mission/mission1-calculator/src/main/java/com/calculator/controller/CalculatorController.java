package com.calculator.controller;

import com.calculator.domain.*;
import com.calculator.view.*;

public class CalculatorController {
    InputView inputView;
    OutputView outputView;
    Calculator calculator;

    public CalculatorController() {
        this.inputView = new InputView();
        this.outputView = new OutputView();
        this.calculator = new Calculator();
    }

    public void result (){
        int firstNumber = inputView.firstNumber();
        int secondNumber = inputView.secondNumber();

        String sum = calculator.addNumber(firstNumber, secondNumber);
        String subtract = calculator.subtractNumber(firstNumber,secondNumber);
        String multiple = calculator.multiplyNumber(firstNumber,secondNumber);
        String divide = calculator.divideNumber(firstNumber,secondNumber);

        outputView.result(sum);
        outputView.result(subtract);
        outputView.result(multiple);
        outputView.result(divide);
    }

}