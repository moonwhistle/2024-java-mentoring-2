package Lotto.domain;

import randomNumber.RandomNumberGenerator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomLottoNumber implements RandomNumberGenerator {

    public static final int limit = 100;
    public static final int lottoElementNumber = 6;

    @Override
    public ArrayList<Integer> generateNumberList(){
        Set<Integer> numberSet = new HashSet<>();
        while (numberSet.size() < lottoElementNumber) {
            int number = random.nextInt(limit);
            numberSet.add(number);
        }

        return new ArrayList<>(numberSet);
    }


}
