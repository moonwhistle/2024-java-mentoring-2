package com.racing.domain;

import java.util.Random;
public class Car {

    private final int LimitNumber = 10;
    private final int StartPosition = 0;
    private final Random random;
    private int position;
    private String carName;
    private int randomNumber;

    public Car(final Random random){
        this.random = random;
    }

    public void setCarName(String carName){
        this.carName = carName;
    }

    public int generateRandom() {
        return randomNumber();
    }

    public int checkMove(int random){
        return validateRandomNumbers(random);
    }

    public void car_move(int move){
        this.position += move;
    }

    private int validateRandomNumbers(final int random){
        if(random >= 4)
            return 1;
        return 0;
    }

    private int randomNumber(){
        return random.nextInt(LimitNumber);
    }
}
