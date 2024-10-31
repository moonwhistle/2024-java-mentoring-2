package com.racing.domain.car;

public class MovingCar {

    public int decideMove(int randomNumber, int state) {
        if (randomNumber > 4) {
            return state++;
        }
        return state;
    }

}
