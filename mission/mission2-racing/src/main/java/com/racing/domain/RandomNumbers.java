package com.racing.domain;

import java.util.ArrayList;
import java.util.List;

public class RandomNumbers implements GenerateRandom {
    private final int zeroIndex = 0;

    @Override
    public Number generateRandomNumber(){
        Number number = new Number(random.nextInt(limitNumber));

        return number;
    }

    @Override
    public List<Integer> randomNumberList(int number){
        List<Integer> randomList = new ArrayList<>();
        for(int i = zeroIndex; i < number; i++){
            randomList.add(random.nextInt());
        }
        return randomList;
    }
}