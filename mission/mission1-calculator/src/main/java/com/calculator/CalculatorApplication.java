package com.calculator;

import com.calculator.controller.CalculatorController;
import com.calculator.domain.Calculator;
import com.calculator.view.InputView;
import com.calculator.view.OutputView;

import java.util.Scanner;

public class CalculatorApplication {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        InputView inputView = new InputView(scanner);
        OutputView outputView = new OutputView();

        CalculatorController calculatorController = new CalculatorController(calculator, inputView, outputView);
        calculatorController.run();
    }
}