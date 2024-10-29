package com.racing.service;

import com.racing.domain.Cars;

public class CarsService {
    private final int startIndex = 0;

    private Cars cars;

    public CarsService(Cars cars) {
        this.cars = cars;
    }

    public String carsDetail(){
        StringBuilder carDetail = new StringBuilder();
        for(int i = startIndex; i < cars.getCarsSize(); i++){
            String carName = cars.getCarsName().get(i);
            int carPosition = cars.getCarsPosition().get(i);
            carDetail.append(carName + " : ");

            for(int j = startIndex; j < carPosition; j++){
                carDetail.append("-");
            }

            carDetail.append("\n");
        }

        return carDetail.toString();
    }

}
