package Lotto.controller;

import Lotto.domain.Lotto;
import Lotto.view.InputView;
import Lotto.view.OutputView;
import randomNumber.RandomNumberGenerator;

public class LottoController {

    private final InputView inputView;
    private final OutputView outputView;
    private final RandomNumberGenerator randomNumberGenerator;

    public LottoController(InputView inputView, OutputView outputView, RandomNumberGenerator randomNumberGenerator){
        this.inputView = inputView;
        this.outputView = outputView;
        this.randomNumberGenerator = randomNumberGenerator;
    }

    public void startLotto(){
        int numberOfLotto = enterLottoNumber();
        Lotto lotto = new Lotto(numberOfLotto, randomNumberGenerator);
        printLottoList(lotto, numberOfLotto);
    }

    private int enterLottoNumber(){
        return inputView.purchaseLotto();
    }

    private void printLottoNumber(int lottoNumber){
        outputView.printLottoNumber(lottoNumber);
    }

    private void printLottoList(Lotto lotto, int lottoNumber){
        printLottoNumber(lottoNumber);
        outputView.printLottoList(lotto);
    }

}
