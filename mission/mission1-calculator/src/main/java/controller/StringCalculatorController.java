package controller;

import java.util.List;

import view.InputView;
import view.OutputView;

import domain.StringCalculator;

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
        String classificationData = stringCalculator.stringClassification(userData);
        String reLocationData = stringCalculator.reLocationNumber(userData);
        String[] seperaterData =  stringCalculator.splitString(reLocationData,classificationData);
        List<Integer> changeTypeData = stringCalculator.changeType(seperaterData);

        outputView.outPut(stringCalculator.sum(changeTypeData));

    }

}
