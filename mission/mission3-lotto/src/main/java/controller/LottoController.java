package controller;

import domain.Lotto;
import view.InputView;
import view.OutputView;

public class LottoController {

    private final InputView inputView;
    private final OutputView outputView;

    public LottoController(InputView inputView, OutputView outputView){
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void startLotto(){
        printLottoNumber();
    }

    private void printLottoNumber(){
        int number = inputView.purchaseLotto();
        System.out.println(number);
    }

}
