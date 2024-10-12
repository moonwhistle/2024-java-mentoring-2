package controller;

import view.InputView;
import view.OutputView;
import domain.StringCalculator;

import java.util.List;

public class StringCalculatorController {

    private final InputView inputView;
    private final OutputView outputView;
    private final StringCalculator stringCalculator;

    public StringCalculatorController(InputView inputView, OutputView outputView,StringCalculator stringCalculator) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.stringCalculator = stringCalculator;
    }

    public void startController() {

        String userData = inputView.insertData();

        outputView.outPut(stringCalculator.classificationSymbol(userData));

    }

}
