package com.racingcar.domain;

import java.util.*;

public class Cars {

    private final List<Car> cars;
    private final RandomNumberGenerator zeroToNineGenerator;

    public Cars(final String[] carsArray){
        this.cars = makeCars(carsArray);
        this.zeroToNineGenerator = new ZeroToNineGenerator();
    }

    private List<Car> makeCars(String[] carsArray){
        List<Car> cars = new ArrayList<>();

        for(String name : carsArray){
            Car car = new Car(name);
            cars.add(car);
        }

        return cars;
    }

    private int getCarMoveState(int randomNumber){
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

    public List<String> getWinner() {
        int winnerPosition = getWinnerPosition();

        return cars.stream()
                .filter(car -> car.getPosition() == winnerPosition)
                .map(Car::getName)
                .toList();
    }

    private int getWinnerPosition(){
        List<Integer> positions = cars.stream()
                .map(Car::getPosition)
                .toList();

        return positions.stream()
                .mapToInt(x -> x)
                .max()
                .orElseThrow(NoSuchElementException::new);
    }
}
