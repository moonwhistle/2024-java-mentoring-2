package com.racing.domain;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    private final int startIndex = 0;
    private List<Car> carList;
    private GenerateRandom generateRandom;
    private final int maxCarNumber = 5;

    public Cars(List<String> inputNames, GenerateRandom generateRandom){
        this.generateRandom = generateRandom;
        Car[] carArray = new Car[inputNames.size()];

        for(int i = startIndex; i < inputNames.size(); i++){
            Name carName = new Name(inputNames.get(i));
            Car car = new Car(carName, generateRandom);
            carArray[i] = car;
        }

        carList = List.of(carArray);
    }

    public void carsMove(){
        for(int i = startIndex; i < carList.size(); i++){
            Car car = carList.get(i);
            Number random = car.getRandomNumber();
            Number move = car.moveOrStop(random);
            car.carMove(move);
        }
    }

    public int getCarsSize(){
        return carList.size();
    }

    public List<Name> getCarsName(){
        List<Name> carsName = new ArrayList<>();
        for(int i = startIndex; i < carList.size(); i++){
            carsName.add(carList.get(i).getCarName());
        }

        return carsName;
    }

    public List<Position> getCarsPosition(){
        List<Position> carsPosition = new ArrayList<>();
        for(int i = startIndex; i < carList.size(); i++){
            carsPosition.add(carList.get(i).getPosition());
        }

        return carsPosition;
    }

}
