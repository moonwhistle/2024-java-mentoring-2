package com.calculator.controller;
import com.calculator.domain.Calculator;
import com.calculator.view.InputView;
import com.calculator.view.OutputView;

public class CalculatorController {
    public int num1 = new InputView().firstNumber();
    public int num2 = new InputView().secondNumber();
    OutputView outputView = new OutputView();

    public void addResult(){
       int result =  new Calculator().add(num1, num2);
       outputView.printAddResult(result);
    }

    public void subtractResult(){
        int result =  new Calculator().subtract(num1, num2);
        outputView.printSubtractResult(result);
    }

    public void multiplyResult(){
        int result =  new Calculator().multiply(num1, num2);
        outputView.printMultiplyResult(result);
    }

    public void divideResult(){
        int result =  new Calculator().divide(num1, num2);
        outputView.printDivideResult(result);
    }

    public void run(){
        addResult();
        subtractResult();
        multiplyResult();
        divideResult();
    }

}
