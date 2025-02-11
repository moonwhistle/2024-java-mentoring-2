package Lotto.domain;

import Lotto.common.exception.ExceptionMessage;
import Lotto.dto.LottoDto;
import randomNumber.RandomNumberGenerator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Lotto {

    public static final int lottoPrice = 1000;
    public static final int lottoElementNumber = 6;
    private final RandomNumberGenerator randomNumberGenerator;
    private final List<LottoNumber> lotto;

    public static class Builder{
        private RandomNumberGenerator randomNumberGenerator;
        private List<LottoNumber> lotto;

        public Builder randomNumberGenerator(RandomNumberGenerator randomNumberGenerator){
            this.randomNumberGenerator = randomNumberGenerator;
            return this;
        }

        public Builder lotto(List<LottoNumber> lotto){
            this.lotto = lotto;
            return this;
        }

        public Lotto build(){
            return new Lotto(this);
        }

    }

    public Lotto(RandomNumberGenerator randomNumberGenerator) {
        this.randomNumberGenerator = randomNumberGenerator;

        lotto = randomNumberGenerator.generateNumberList();
        duplicateNumber();
    }

    private Lotto(Builder builder){
        this.lotto = builder.lotto;
        this.randomNumberGenerator = builder.randomNumberGenerator;
    }

    public List<LottoNumber> getLotto(){
        return lotto;
    }

    public List<Integer> toLottoDto(){
        return new LottoDto(lotto).getLotto();
    }

    public List<LottoNumber> createUserLottoNumber(String userLotto){
        return createUserLottoList(userLotto).stream()
                .map(LottoNumber::new)
                .collect(Collectors.toList());
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

    private List<Integer> createUserLottoList(String userLotto){
        return Arrays.stream(userLotto.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }

}
