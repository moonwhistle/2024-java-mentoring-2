package Lotto.controller;

import Lotto.view.InputView;
import Lotto.view.OutputView;

public class LottoController {

    private final InputView inputView;
    private final OutputView outputView;

    public LottoController(InputView inputView, OutputView outputView){
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void startLotto(){
        purchaseLotto();
    }

    private void purchaseLotto(){
        enterLottoNumber();
        printLottoNumber();
    }

    private int enterLottoNumber(){
        int number = inputView.purchaseLotto();
        return number;
    }

    private void printLottoNumber(){
        int lottoNumber = enterLottoNumber();
        outputView.printLottoNumber(lottoNumber);
    }

}
