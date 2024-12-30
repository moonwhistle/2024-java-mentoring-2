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
        Lotto lotto = new Lotto(enterLottoNumber(), randomNumberGenerator);
        int numberOfLotto = enterLottoNumber();
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
