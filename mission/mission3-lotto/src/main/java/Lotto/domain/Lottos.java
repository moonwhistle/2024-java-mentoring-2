package Lotto.domain;

import Lotto.common.exception.ExceptionMessage;
import randomNumber.RandomNumberGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Lottos {

    private List<Lotto> lottos;
    private int inputPrice;
    private final RandomNumberGenerator randomNumberGenerator;

    public Lottos(int inputPrice, RandomNumberGenerator randomNumberGenerator){
        this.randomNumberGenerator = randomNumberGenerator;
        validLottoNumber(inputPrice);
        this.inputPrice = inputPrice;
        this.lottos = createLottos();
    }

    public List<Lotto> getLottos(){
        return new ArrayList<>(lottos);
    }

    public int getInputPrice(){
        return inputPrice;
    }

    public int getNumberOfLottos(){
        return inputPrice / Lotto.lottoPrice;
    }

    public int calculateLottoNumber(int inputPrice){
        return inputPrice / Lotto.lottoPrice;
    }

    public void validLottoNumber(int inputPrice){
        if(inputPrice < Lotto.lottoPrice)
            throw new IllegalArgumentException(ExceptionMessage.INVALID_LOTTO_NUMBER.getMessage());
    }

    public long calculateWinningResult(Lottos lottos, List<LottoNumber> winningNumber){
        return getLottos().stream()
                .mapToLong(lotto -> compareLottoAndWinningNumber(lotto, winningNumber))
                .max()
                .orElse(0);
    }

    public String printLottoList(Lottos lottos){
        return getLottos().stream()
                .map(lotto -> lotto.toLottoDto().toString())
                .collect(Collectors.joining("\n"));
    }

    private long compareLottoAndWinningNumber(Lotto lotto, List<LottoNumber> winningNumber) {
        return lotto.getLotto().stream()
                .filter(lottoNumber -> winningNumber.stream().anyMatch(winning -> lottoNumber.checkSameWinningNumber(winning)))
                .count();
    }

    private List<Lotto> createLottos(){
        return IntStream.range(0, getNumberOfLottos())
                .mapToObj(i -> new Lotto(randomNumberGenerator))
                .collect(Collectors.toList());
    }

}
