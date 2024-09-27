package controller;

import view.InputView;
import domain.Calculator;
import view.OutputView;

public class CalculatorController {

    private final InputView inputView;
    private final OutputView outputView;
    private final Calculator calculator;

    public CalculatorController(InputView inputView, OutputView outputView, Calculator calculator) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.calculator = calculator;
    }

    public void startController() {
        int firstNumber= inputView.firstNumber();
        int secondNumber = inputView.secondNumber();

        outputView.outPut(calculator.add(firstNumber, secondNumber));
        outputView.outPut(calculator.subtract(firstNumber, secondNumber));
        outputView.outPut(calculator.multiply(firstNumber, secondNumber));
        outputView.outPut(calculator.divide(firstNumber, secondNumber));
    }

}