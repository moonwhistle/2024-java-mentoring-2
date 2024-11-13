package com.racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    private final List<Car> cars;
    private final RandomNumberGenerator zeroToNineGenerator;

    public Cars(final String carNames){
        this.cars = makeCars(carNames);
        this.zeroToNineGenerator = new ZeroToNineGenerator();
    }

    public List<Car> makeCars(String carNames){
        String[] carsArray = carNames.split(",");
        List<Car> cars = new ArrayList<>();

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

    public List<Car> getCars(){
        return cars;
    }
}
