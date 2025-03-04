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
        int manualLottoNumber = enterManualLottoNumber();
        Lottos lottos = createManualLotto(manualLottoNumber);
        printLottoList(lottos);
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

    private Lottos createLottos(){
        int inputPrice = enterLottoNumber();
        return new Lottos.Builder()
                .inputPrice(inputPrice)
                .lottoGenerator(lottoGenerator)
                .addAutoLotto()
                .build();
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

    private String enterManualLotto(){
        return inputView.enterManualLotto();
    }

    private Lottos createManualLotto(int manualLottoNumber){
        System.out.println(DisplayText.ENTER_MANUAL_LOTTO.getInputMessage());
        return new Lottos.Builder().lottoGenerator(lottoGenerator).addManualLotto(enterManualLotto(), manualLottoNumber).build();
    }

}
