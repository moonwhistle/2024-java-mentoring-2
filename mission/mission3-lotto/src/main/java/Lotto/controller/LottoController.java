package Lotto.controller;

import Lotto.domain.Lotto;
import Lotto.domain.LottoNumber;
import Lotto.domain.Lottos;

import Lotto.domain.WinningNumber;
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
        List<LottoNumber> winningNumber = getWinningNumber();
        System.out.println(calculateMatchCount(lottos, winningNumber));
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

    private long calculateMatchCount(Lottos lottos, List<LottoNumber> winningNumber){
        return lottoService.calculateWinningResult(lottos, winningNumber);
    }

}
