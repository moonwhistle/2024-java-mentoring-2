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
    private final Winning winning;

    public LottoController(InputView inputView, OutputView outputView, RandomNumberGenerator randomNumberGenerator, Winning winning){
        this.inputView = inputView;
        this.outputView = outputView;
        this.randomNumberGenerator = randomNumberGenerator;
        this.winning = winning;
    }

    public void startLotto(){
        Lottos lottos = createLottos();
        printLottoList(lottos);
        List<LottoNumber> winningNumber = getWinningNumber();
        BonusNumber bonusNumber = createBonusNumber();
        Long matchCount = calculatePrice(winningNumber, lottos, bonusNumber);
        matchWinningResult(matchCount);
        printWinningResult();
        calculateProfit(lottos.getNumberOfLottos(), matchCount);
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
        String lottoList = lottos.printLottoList();
        outputView.printLottoList(lottoList);
    }

    private List<LottoNumber> getWinningNumber(){
        WinningNumber winningNumber = new WinningNumber(inputView.enterWinningNumber());
        return winningNumber.getWinningNumber();
    }

    private Long calculatePrice(List<LottoNumber> winningNumber, Lottos lottos, BonusNumber bonusNumber){
        return winning.calculatePrice(winningNumber, lottos, bonusNumber);
    }

    private void printWinningResult(){
        outputView.printWinningBar();
        String winningResult = winning.getWinningResult();
        outputView.printWinningResult(winningResult);
    }

    private void matchWinningResult(Long matchCount){
        winning.matchWinningResult(matchCount);
    }

    private void calculateProfit(int numberOfLotto, Long matchCount){
        double profit = winning.calculateProfit(numberOfLotto, matchCount);
        outputView.printProfit(profit);
    }

    private String enterBonusNumber(){
        return inputView.enterBonusNumber();
    }

    private BonusNumber createBonusNumber(){
        return new BonusNumber(enterBonusNumber());
    }

    private boolean canGetBonusNumber(BonusNumber bonusNumber, Long matchCount){
        return bonusNumber.canBonusNumber(matchCount);
    }

}
