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

        int sum = calculator.addNumber(firstNumber, secondNumber);
        int divide = calculator.divideNumber(firstNumber,secondNumber);
        int multiple = calculator.multiplyNumber(firstNumber,secondNumber);
        int subtract = calculator.subtractNumber(firstNumber,secondNumber);

        outputView.result(sum);
        outputView.result(divide);
        outputView.result(multiple);
        outputView.result(subtract);
    }

}
