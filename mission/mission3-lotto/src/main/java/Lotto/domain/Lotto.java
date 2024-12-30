package Lotto.domain;

import randomNumber.RandomNumberGenerator;

import java.util.ArrayList;

public class Lotto {

    private final ArrayList<Integer> lottoNumber;
    private final RandomNumberGenerator randomNumberGenerator;
    private final ArrayList<ArrayList<Integer>> lottoList = new ArrayList<>();

    public Lotto(int numberOfLotto, RandomNumberGenerator randomNumberGenerator){
        this.randomNumberGenerator = randomNumberGenerator;
        this.lottoNumber = randomNumberGenerator.generateNumberList();

        for(int i = 0; i < numberOfLotto; i++){
            lottoList.add(lottoNumber);
        }
    }

    public ArrayList<ArrayList<Integer>> getLottoList(){
        return lottoList;
    }

    public ArrayList<Integer> getLottoNumber(){
        return lottoNumber;
    }

}
