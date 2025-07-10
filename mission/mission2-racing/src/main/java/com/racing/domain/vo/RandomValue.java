package com.racing.domain.vo;

import com.racing.domain.Value;
import com.racing.common.exception.RandomValueOutOfRange;

import java.util.Random;

public class RandomValue implements RandomNumber {

    private final Random random;

    public RandomValue(Random random) {
        this.random = random;
    }

    @Override
    public int randomValue() {
        int randomNumber = random.nextInt(Value.MAX_RANDOM_VALUE.getValue());
        NegativeValueException(randomNumber);
        OutOfRangeException(randomNumber);
        return randomNumber;
    }

    private void NegativeValueException(int randomNumber){
        if (randomNumber < Value.NEGATIVE_VALUE.getValue()) {
            throw new RandomValueOutOfRange();
        }
    }

    private void OutOfRangeException(int randomNumber){
        if(randomNumber > Value.OUT_OF_RANGE.getValue()){
            throw new RandomValueOutOfRange();
        }
    }

}
