package Lotto.domain;

import Lotto.exception.ExceptionMessage;
import randomNumber.RandomNumberGenerator;

import java.util.ArrayList;
import java.util.List;

public class Lotto {

    public static final int lottoPrice = 1000;
    private final RandomNumberGenerator randomNumberGenerator;
    private final List<Integer> lotto;

    public Lotto(RandomNumberGenerator randomNumberGenerator) {
        this.randomNumberGenerator = randomNumberGenerator;

        lotto = randomNumberGenerator.generateNumberList();
        duplicateNumber();
    }

    public List<Integer> getLotto(){
        return new ArrayList<>(lotto);
    }

    private void duplicateNumber(){
        long lottoNumber = lotto.stream()
                .distinct()
                .count();
        if(lottoNumber != RandomLottoNumber.lottoElementNumber)
            throw new IllegalArgumentException(ExceptionMessage.DUPLICATE_NUMBER.getMessage());
    }

}
