package Lotto.domain;

import Lotto.common.exception.ExceptionMessage;
import Lotto.dto.LottoDto;
import randomNumber.RandomNumberGenerator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Lotto {

    public static final int lottoPrice = 1000;
    public static final int lottoElementNumber = 6;
    private final RandomNumberGenerator randomNumberGenerator;
    private final List<LottoNumber> lotto;

    public Lotto(RandomNumberGenerator randomNumberGenerator) {
        this.randomNumberGenerator = randomNumberGenerator;

        lotto = randomNumberGenerator.generateNumberList();
        duplicateNumber();
    }

    public List<LottoNumber> getLotto(){
        return lotto;
    }

    public List<Integer> toLottoDto(){
        return new LottoDto(lotto).getLotto();
    }

    private void duplicateNumber(){
        long lottoNumber = numberOfNotDuplicatedNumber();
        if(lottoNumber != lottoElementNumber)
            throw new IllegalArgumentException(ExceptionMessage.DUPLICATE_NUMBER.getMessage());
    }

    private List<Integer> toInteger(){
        return lotto.stream()
                .map(LottoNumber::getLottoNumber)
                .collect(Collectors.toList());
    }

    private long numberOfNotDuplicatedNumber(){
        return toInteger().stream()
                .distinct()
                .count();
    }

}
