package Lotto.controller;

import Lotto.domain.Lotto;
import Lotto.domain.Lottos;

import Lotto.service.LottoService;
import Lotto.view.InputView;
import Lotto.view.OutputView;
import randomNumber.RandomNumberGenerator;

import java.util.Collections;
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
        Lottos lottos = new Lottos(createLottos(numberOfLotto));
        printLottoList(lottos, numberOfLotto);
    }

    private int enterLottoNumber(){
        int inputPrice = inputView.purchaseLotto();
        lottoService.validInputPrice(inputPrice);
        return inputPrice / Lotto.lottoPrice;
    }

    private List<Lotto> createLottos(int numberOfLotto){
        return IntStream.range(0, numberOfLotto)
                .mapToObj(i -> new Lotto(randomNumberGenerator))
                .collect(Collectors.toList());
    }

    private void printLottoNumber(int lottoNumber){
        outputView.printLottoNumber(lottoNumber);
    }

    private void printLottoList(Lottos lottos, int lottoNumber){
        printLottoNumber(lottoNumber);
        String lottoList = lottos.printLottoList();
        outputView.printLottoList(lottoList);
    }

}
