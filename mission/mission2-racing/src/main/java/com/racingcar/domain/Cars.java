package com.racingcar.domain;

import java.util.*;

public class Cars {

    private final List<Car> cars;
    private final RandomNumberGenerator zeroToNineGenerator;

    public Cars(final String carNames){
        this.cars = makeCars(carNames);
        this.zeroToNineGenerator = new ZeroToNineGenerator();
    }

    public List<Car> makeCars(String carNames){
        List<Car> cars = new ArrayList<>();

        String[] carsArray = carNames.split(",");

        for(String name : carsArray){
            Car car = new Car(name);
            cars.add(car);
        }

        return cars;
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
}
