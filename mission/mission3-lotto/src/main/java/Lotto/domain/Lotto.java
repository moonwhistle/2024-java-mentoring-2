package Lotto.domain;

import randomNumber.RandomNumberGenerator;

import java.util.ArrayList;

public class Lotto {

    private final RandomNumberGenerator randomNumberGenerator;
    private final ArrayList<ArrayList<Integer>> lottoList = new ArrayList<>();

    public Lotto(int numberOfLotto, RandomNumberGenerator randomNumberGenerator){
        this.randomNumberGenerator = randomNumberGenerator;

        for(int i = 0; i < numberOfLotto; i++){
            lottoList.add(randomNumberGenerator.generateNumberList());
        }
    }

    public ArrayList<ArrayList<Integer>> getLottoList(){
        return lottoList;
    }

}
