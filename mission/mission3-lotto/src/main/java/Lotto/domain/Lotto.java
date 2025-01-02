package Lotto.domain;

import randomNumber.RandomNumberGenerator;

import java.util.ArrayList;
import java.util.List;

public class Lotto {

    public static final int lottoPrice = 1000;
    private final RandomNumberGenerator randomNumberGenerator;
    private final List<Integer> lotto;

    public Lotto(RandomNumberGenerator randomNumberGenerator){
        this.randomNumberGenerator = randomNumberGenerator;

        lotto = randomNumberGenerator.generateNumberList();
        duplicateNumber();
    }

    private void duplicateNumber(){
        long lottoNumber = lotto.stream().distinct().count();
        if(lottoNumber != RandomLottoNumber.lottoElementNumber)
            throw new IllegalArgumentException("로또 번호에 중복이 있습니다.");
    }

    public List<Integer> getLotto(){
        return new ArrayList<>(lotto);
    }

}
