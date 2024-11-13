package com.racingcar.domain;

import java.util.List;

public class Cars {

    private final List<Car> cars;
    private final RandomNumberGenerator zeroToNineGenerator;

    public Cars(final List<Car> cars){
        this.cars = cars;
        this.zeroToNineGenerator = new ZeroToNineGenerator();
    }

    public int getCarMoveState(int randomNumber){
        if(randomNumber >= 4){
            return 1;
        }

        return 0;
    }

    public void moveCars(){
        for(final Car car : cars){
            int randomNumber = zeroToNineGenerator.getRandomNumber();
            int moveState = getCarMoveState(randomNumber);
            car.move(moveState);
        }
    }

    public List<Car> getCars(){
        return cars;
    }
}
