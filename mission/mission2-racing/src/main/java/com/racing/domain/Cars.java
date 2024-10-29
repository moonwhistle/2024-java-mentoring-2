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
            Car car = new Car(inputNames.get(i), generateRandom);
            carArray[i] = car;
        }

        carList = List.of(carArray);
    }

    public void carsMove(){
        for(int i = startIndex; i < carList.size(); i++){
            Car car = carList.get(i);
            int random = car.getRandomNumber();
            int move = car.moveOrStop(random);
            car.carMove(move);
        }
    }

    public int getCarsSize(){
        return carList.size();
    }

    public List<String> getCarsName(){
        List<String> carsName = new ArrayList<>();
        for(int i = startIndex; i < carList.size(); i++){
            carsName.add(carList.get(i).getCarName());
        }

        return carsName;
    }

    public List<Integer> getCarsPosition(){
        List<Integer> carsPosition = new ArrayList<>();
        for(int i = startIndex; i < carList.size(); i++){
            carsPosition.add(carList.get(i).getPosition());
        }

        return carsPosition;
    }

}
