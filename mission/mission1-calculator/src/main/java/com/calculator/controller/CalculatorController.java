package com.calculator.controller;

import com.calculator.domain.Calculator;

import com.calculator.domain.StringCalculator;
import com.calculator.view.InputView;
import com.calculator.view.OutputView;

import java.util.List;

public class CalculatorController {

    private final InputView inputView;
    private final OutputView outputView;

    private final Calculator calculator;
    private final StringCalculator stringCalculator;

    public CalculatorController(InputView inputView, OutputView outputView, Calculator calculator, StringCalculator stringCalculator) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.calculator = calculator;
        this.stringCalculator = stringCalculator;
    }

    public void controllerStart() {
        int firstOperand = inputView.firstOperand();
        int secondOperand = inputView.secondOperand();
        outputView.printResult(calculator.add(firstOperand, secondOperand));
        outputView.printResult(calculator.subtract(firstOperand, secondOperand));
        outputView.printResult(calculator.multiply(firstOperand, secondOperand));
        outputView.printResult(calculator.divide(firstOperand, secondOperand));
    }

    public void stringControllerStart() {
        String messageOperand = inputView.messageOperand();
        String separator = stringCalculator.getSeparator(messageOperand);
        String message = stringCalculator.getMessage(messageOperand);
        String[] afterSeparateMessage = stringCalculator.separate(message, separator);
        List<Integer> numberSet = stringCalculator.saveNumbers(afterSeparateMessage);
        outputView.printResult(stringCalculator.addNumbers(numberSet));
    }
}
