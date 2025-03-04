package Lotto.controller;

import Lotto.common.displayText.DisplayText;
import Lotto.domain.*;

import Lotto.view.InputView;
import Lotto.view.OutputView;
import randomNumber.RandomNumberGenerator;

import java.util.List;
import java.util.stream.IntStream;

public class LottoController {

    private final InputView inputView;
    private final OutputView outputView;
    private final Winning winning;
    private final LottoGenerator lottoGenerator;
    private final Profit profit;

    public LottoController(InputView inputView, OutputView outputView, RandomNumberGenerator randomNumberGenerator, Winning winning, Profit profit, LottoGenerator lottoGenerator){
        this.inputView = inputView;
        this.outputView = outputView;
        this.winning = winning;
        this.profit = profit;
        this.lottoGenerator = lottoGenerator;
    }

    public void startLotto(){
        int inputPrice = enterLottoNumber();
        int manualLottoNumber = enterManualLottoNumber();
        Lottos lottos = createManualLotto(manualLottoNumber, inputPrice);
        printLottoList(lottos, manualLottoNumber);
        List<LottoNumber> winningNumber = getWinningNumber();
        BonusNumber bonusNumber = createBonusNumber();
        Long matchCount = calculatePrice(winningNumber, lottos, bonusNumber);
        matchWinningResult(matchCount);
        printWinningResult(matchCount);
        calculateProfit(lottos.getNumberOfLottos());
    }

    private int enterLottoNumber(){
        return inputView.purchaseLotto();
    }

    private void printLottoList(Lottos lottos, int manualLottoNumber){
        printManualLottoNumber(manualLottoNumber);
        printAutoLottoNumber(lottos.getNumberOfLottos() - manualLottoNumber);
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

    private void printWinningResult(long matchCount){
        outputView.printWinningBar();
        String winningResult = winning.getWinningResult(matchCount);
        outputView.printWinningResult(winningResult);
    }

    private void matchWinningResult(Long matchCount){
        winning.matchWinningResult(matchCount);
    }

    private void calculateProfit(int numberOfLotto){
        double profitResult = profit.calculateProfit(numberOfLotto);
        outputView.printProfit(profitResult);
    }

    private String enterBonusNumber(){
        return inputView.enterBonusNumber();
    }

    private BonusNumber createBonusNumber(){
        return new BonusNumber(enterBonusNumber());
    }

    private int enterManualLottoNumber(){
        return inputView.enterManualLottoNumber();
    }

    private List<String> enterManualLotto(int manualLottoNumber){
        return inputView.enterManualLotto(manualLottoNumber);
    }

    private Lottos createManualLotto(int manualLottoNumber, int inputPrice){
        return new Lottos.Builder().
                inputPrice(inputPrice).
                lottoGenerator(lottoGenerator).
                addManualLotto(enterManualLotto(manualLottoNumber))
                .addAutoLotto()
                .build();
    }

    private void printAutoLottoNumber(int lottoNumber){
        outputView.printAutoLottoNumber(lottoNumber);
    }

    private void printManualLottoNumber(int lottoNumber){
        outputView.printManualLottoNumber(lottoNumber);
    }

}
