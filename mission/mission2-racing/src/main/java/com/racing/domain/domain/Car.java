package com.racing.domain.domain;

import com.racing.domain.domain.vo.RandomValue;
import com.racing.domain.exception.IllegalIndexException;

public class Car {

    private final RandomValue randomValue;
    private int count = 0;

    public Car(RandomValue randomValue) {
        this.randomValue = randomValue;
    }

    public int RandomNumber() {
        int number = randomValue.randomValue();
        NegativeValueException(number);
        OutOfRangeException(number);
        return number;
    }

    public int checkRandomValue(int random) {
        if (random > Value.SPEC_RANG.getValue()) {
            count++;
        }
        return count;
    }

    private void NegativeValueException(int number){
        if (number < Value.NEG_VAL.getValue()) {
            throw new IllegalIndexException();
        }
    }

    private void OutOfRangeException(int number){
        if(number > Value.OUT_RANG.getValue()){
            throw new IllegalIndexException();
        }
    }

}
