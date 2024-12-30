package Lotto.domain;

import randomNumber.RandomNumberGenerator;

import java.util.ArrayList;
import java.util.Random;

public class RandomLottoNumber implements RandomNumberGenerator {

    private static final int limit = 100;
    private static final int lottoElementNumber = 6;
    private ArrayList<Integer> numberList = new ArrayList<>();

    @Override
    public ArrayList<Integer> generateNumberList(){
        for(int i = 0 ; i < lottoElementNumber; i++){
            int number = random.nextInt(limit);
            numberList.add(number);
        }

        return numberList;
    }

}
