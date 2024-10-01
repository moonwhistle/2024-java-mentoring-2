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
        int userFirstNumber= inputView.firstNumber();
        int userSecondNumber = inputView.secondNumber();

        outputView.outPut(calculator.add(userFirstNumber, userSecondNumber));
        outputView.outPut(calculator.subtract(userFirstNumber, userSecondNumber));
        outputView.outPut(calculator.multiply(userFirstNumber, userSecondNumber));
        outputView.outPut(calculator.divide(userFirstNumber, userSecondNumber));
    }

}
