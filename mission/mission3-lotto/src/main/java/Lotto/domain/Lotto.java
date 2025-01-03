package Lotto.domain;

import Lotto.exception.ExceptionMessage;
import randomNumber.RandomNumberGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lotto {

    public static final int lottoPrice = 1000;
    private final RandomNumberGenerator randomNumberGenerator;
    private final List<LottoNumber> lotto;

    public Lotto(RandomNumberGenerator randomNumberGenerator) {
        this.randomNumberGenerator = randomNumberGenerator;

        lotto = randomNumberGenerator.generateNumberList();
        duplicateNumber();
    }

    public List<Integer> getLotto(){
        return new ArrayList<>(lotto.stream()
                .map(lottoNumber -> lottoNumber.getLottoNumber())
                .collect(Collectors.toList()));
    }

    private void duplicateNumber(){
        long lottoNumber = lotto.stream()
                .distinct()
                .count();
        if(lottoNumber != RandomLottoNumber.lottoElementNumber)
            throw new IllegalArgumentException(ExceptionMessage.DUPLICATE_NUMBER.getMessage());
    }

}
