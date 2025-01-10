package Lotto.controller;

import Lotto.domain.*;

import Lotto.view.InputView;
import Lotto.view.OutputView;
import randomNumber.RandomNumberGenerator;

import java.util.List;

public class LottoController {

    private final InputView inputView;
    private final OutputView outputView;
    private final RandomNumberGenerator randomNumberGenerator;
    private Lottos lottos;
    private Lotto lotto;
    private final Winning winning = new Winning();

    public LottoController(InputView inputView, OutputView outputView, RandomNumberGenerator randomNumberGenerator){
        this.inputView = inputView;
        this.outputView = outputView;
        this.randomNumberGenerator = randomNumberGenerator;
    }

    public void startLotto(){
        Lottos lottos = createLottos();
        printLottoList(lottos);
        List<LottoNumber> winningNumber = getWinningNumber();
        Long matchCount = calculateMatchCount(lottos, winningNumber);
        matchWinningResult(matchCount);
        printWinningResult();
        calculateProfit(lottos, matchCount);
    }

    private int enterLottoNumber(){
        return inputView.purchaseLotto();
    }

    private Lottos createLottos(){
        int inputPrice = enterLottoNumber();
        return new Lottos(inputPrice, randomNumberGenerator);
    }

    private void printLottoNumber(int lottoNumber){
        outputView.printLottoNumber(lottoNumber);
    }

    private void printLottoList(Lottos lottos){
        printLottoNumber(lottos.getNumberOfLottos());
        String lottoList = lottos.printLottoList(lottos);
        outputView.printLottoList(lottoList);
    }

    private List<LottoNumber> getWinningNumber(){
        WinningNumber winningNumber = new WinningNumber(inputView.enterWinningNumber());
        return winningNumber.getWinningNumber();
    }

    private long calculateMatchCount(Lottos lottos, List<LottoNumber> winningNumber){
        return lottos.calculateWinningResult(lottos, winningNumber);
    }

    private void printWinningResult(){
        outputView.printWinningBar();
        String winningResult = winning.getWinningResult();
        outputView.printWinningResult(winningResult);
    }

    private void matchWinningResult(Long matchCount){
        winning.matchWinningResult(matchCount);
    }

    private void calculateProfit(Lottos lottos, Long matchCount){
        double profit = winning.calculateProfit(lottos, matchCount);
        outputView.printProfit(profit);
    }

}
