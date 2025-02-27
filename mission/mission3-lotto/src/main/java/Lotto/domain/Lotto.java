package Lotto.domain;

import Lotto.common.exception.ExceptionMessage;
import Lotto.dto.LottoDto;
import Lotto.util.LottoValidator;
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
        private List<LottoNumber> lotto = new ArrayList<>();

        public Builder randomNumberGenerator(RandomNumberGenerator randomNumberGenerator){
            this.randomNumberGenerator = randomNumberGenerator;
            return this;
        }

        public Builder lotto(List<LottoNumber> lotto){
            this.lotto = new ArrayList<>(lotto);
            LottoValidator.validateLottoNumber(lotto);
            return this;
        }

        public Lotto build(){
            return new Lotto(this);
        }

    }

    private Lotto(Builder builder){
        this.lotto = builder.lotto;
        this.randomNumberGenerator = builder.randomNumberGenerator;
    }

    public List<LottoNumber> getLotto(){
        return Collections.unmodifiableList(lotto);
    }

    @Override
    public String toString(){
        return lotto.stream()
                .map(lottoNumber -> String.valueOf(lottoNumber.getLottoNumber()))
                .collect(Collectors.joining(", ", "[", "]"));
    }

}
