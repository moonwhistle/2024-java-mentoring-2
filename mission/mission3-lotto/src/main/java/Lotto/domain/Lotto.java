package Lotto.domain;

import randomNumber.RandomNumberGenerator;

import java.util.ArrayList;
import java.util.List;

public class Lotto {

    private final RandomNumberGenerator randomNumberGenerator;
    private final List<Integer> lotto;

    public Lotto(RandomNumberGenerator randomNumberGenerator){
        this.randomNumberGenerator = randomNumberGenerator;

        lotto = randomNumberGenerator.generateNumberList();
    }

    public List<Integer> getLotto(){
        return new ArrayList<>(lotto);
    }

}
