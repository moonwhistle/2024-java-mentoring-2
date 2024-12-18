package com.calculator.controller;
import com.calculator.domain.Calculator;
import com.calculator.view.InputView;
import com.calculator.view.OutputView;

public class CalculatorController {
    private final Calculator calculator;
    private final InputView inputView;
    private final OutputView outputView;
    private final int firstNumber;
    private final int secondNumber;

    public CalculatorController(Calculator calculator, InputView inputView, OutputView outputView) {
        this.calculator = calculator;
        this.inputView = inputView;
        this.outputView = outputView;
        this.firstNumber = inputView.firstNumber();
        this.secondNumber = inputView.secondNumber();
    }

    private void addResult(){
       int add = calculator.add(firstNumber, secondNumber);
       int result = outputView.calculationResult(add);
       System.out.println("더하기 계산 결과 = " + result);
    }

    private void subtractResult(){
        int subtract = calculator.subtract(firstNumber, secondNumber);
        int result = outputView.calculationResult(subtract);
        System.out.println("빼기 계산 결과 = " + result);
    }

    private void multiplyResult(){
        int multiply = calculator.multiply(firstNumber, secondNumber);
        int result = outputView.calculationResult(multiply);
        System.out.println("곱하기 계산 결과 = " + result);
    }

    private void divideResult(){
        int divide = calculator.divide(firstNumber, secondNumber);
        int result = outputView.calculationResult(divide);
        System.out.println("나누기 계산 결과 = " + result);
    }

    public void run(){
        addResult();
        subtractResult();
        multiplyResult();
        divideResult();
    }

}
