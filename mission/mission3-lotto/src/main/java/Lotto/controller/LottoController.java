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
        Long matchCount = calculatePrice(winningNumber, lottos);
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

    private Long calculateMatchCount(List<LottoNumber> winningNumber, List<LottoNumber> lottoNumbers){
        return winning.calculateWinningResult(winningNumber, lottoNumbers);
    }

    private Long calculatePrice(List<LottoNumber> winningNumber, Lottos lottos){
        long max = 0;

        for(int i = 0; i < lottos.getNumberOfLottos(); i++){
            max = Math.max(max, calculateMatchCount(winningNumber, lottos.getLottos().get(i).getLotto()));
        }

        return max;
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

}
