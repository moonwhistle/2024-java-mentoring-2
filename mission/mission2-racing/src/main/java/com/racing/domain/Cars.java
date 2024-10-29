package com.racing.domain;

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

}
