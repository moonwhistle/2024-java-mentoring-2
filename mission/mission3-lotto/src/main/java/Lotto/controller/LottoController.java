package Lotto.controller;

import Lotto.domain.*;

import Lotto.service.LottoService;
import Lotto.view.InputView;
import Lotto.view.OutputView;
import randomNumber.RandomNumberGenerator;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LottoController {

    private final InputView inputView;
    private final OutputView outputView;
    private final RandomNumberGenerator randomNumberGenerator;
    private final LottoService lottoService;

    public LottoController(InputView inputView, OutputView outputView, RandomNumberGenerator randomNumberGenerator, LottoService lottoService){
        this.inputView = inputView;
        this.outputView = outputView;
        this.randomNumberGenerator = randomNumberGenerator;
        this.lottoService = lottoService;
    }

    public void startLotto(){
        int numberOfLotto = enterLottoNumber();
        Lottos lottos = new Lottos(createLottos(numberOfLotto), numberOfLotto);
        printLottoList(lottos, numberOfLotto);
        Long matchCount = calculateMatchCount(lottos);
        matchWinningResult(lottos, matchCount);
        printWinningResult();
        calculateProfit(lottos, matchCount);
    }

    private List<Lotto> createLottos(int numberOfLotto){
        return IntStream.range(0, numberOfLotto)
                .mapToObj(i -> new Lotto(randomNumberGenerator))
                .collect(Collectors.toList());
    }

    private int enterLottoNumber(){
        int inputPrice = inputView.purchaseLotto();
        return lottoService.calculateLottoNumber(inputPrice);
    }

    private void printLottoNumber(int lottoNumber){
        outputView.printLottoNumber(lottoNumber);
    }

    private void printLottoList(Lottos lottos, int lottoNumber){
        printLottoNumber(lottoNumber);
        String lottoList = lottoService.printLottoList(lottos);
        outputView.printLottoList(lottoList);
    }

    private List<LottoNumber> getWinningNumber(){
        WinningNumber winningNumber = new WinningNumber(inputView.enterWinningNumber());
        return winningNumber.getWinningNumber();
    }

    private long calculateMatchCount(Lottos lottos){
        List<LottoNumber> winningNumber = getWinningNumber();
        return lottoService.calculateWinningResult(lottos, winningNumber);
    }

    private void printWinningResult(){
        outputView.printWinningBar();
        String winningResult = lottoService.getWinningResult();
        outputView.printWinningResult(winningResult);
    }

    private void matchWinningResult(Lottos lottos, Long matchCount){
        if(matchCount == WinningResult.FIRST_PRICE.getMatchCount())
            WinningResult.FIRST_PRICE.incrementPrizeCount();
        if(matchCount == WinningResult.SECOND_PRICE.getMatchCount())
            WinningResult.SECOND_PRICE.incrementPrizeCount();
        if(matchCount == WinningResult.THIRD_PRICE.getMatchCount())
            WinningResult.THIRD_PRICE.incrementPrizeCount();
        if(matchCount == WinningResult.FOURTH_PRICE.getMatchCount())
            WinningResult.FOURTH_PRICE.incrementPrizeCount();
    }

    private void calculateProfit(Lottos lottos, Long matchCount){
        double profit = lottoService.calculateProfit(lottos, matchCount);
        outputView.printProfit(profit);
    }

}
