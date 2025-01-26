package Lotto.domain;

import Lotto.common.exception.ExceptionMessage;
import randomNumber.RandomNumberGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Lottos {

    private final List<Lotto> lottos;
    private final int inputPrice;
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

    public String printLottoList(){
        return getLottos().stream()
                .map(lotto -> lotto.toLottoDto().toString())
                .collect(Collectors.joining("\n"));
    }

    private List<Lotto> createLottos(){
        return IntStream.range(0, getNumberOfLottos())
                .mapToObj(i -> new Lotto(randomNumberGenerator))
                .collect(Collectors.toList());
    }

    private void validLottoNumber(int inputPrice){
        if(inputPrice < Lotto.lottoPrice)
            throw new IllegalArgumentException(ExceptionMessage.INVALID_LOTTO_NUMBER.getMessage());
    }

}
