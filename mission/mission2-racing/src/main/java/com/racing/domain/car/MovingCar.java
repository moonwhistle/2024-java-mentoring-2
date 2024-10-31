package com.racing.domain.car;

import com.racing.domain.number.RandomNumberGenerator;

public class MovingCar {

    private final RandomNumberGenerator randomNumberGenerator;

    public MovingCar(RandomNumberGenerator randomNumberGenerator) {
        this.randomNumberGenerator = randomNumberGenerator;
    }
    public int decideMove(int number, int state) {
        if (number < 4) {
            return state;
        }
        return ++state;
    }

}
