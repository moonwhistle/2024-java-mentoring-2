package com.racing.service;

import com.racing.domain.Cars;
import com.racing.domain.Name;
import com.racing.domain.Position;

import java.util.ArrayList;
import java.util.List;

public class CarsService {
    private final int startIndex = 0;

    private Cars cars;

    public CarsService(Cars cars) {
        this.cars = cars;
    }

    public String carsDetail(){
        StringBuilder carDetail = new StringBuilder();
        for(int i = startIndex; i < cars.getCarsSize(); i++){
            Name carName = cars.getCarsName().get(i);
            Position carPosition = cars.getCarsPosition().get(i);
            carDetail.append(carName.getName() + " : ");

            for(int j = startIndex; j < carPosition.getPosition(); j++){
                carDetail.append("-");
            }

            carDetail.append("\n");
        }

        return carDetail.toString();
    }

    public List<String> winnerList(){
        List<String> winner = new ArrayList<>();
        for(int i = startIndex; i < cars.getCarsSize(); i++) {
            Position carPosition = cars.getCarsPosition().get(i);
            if(carPosition.getPosition() == getMaxPosition()) {
                Name carName = cars.getCarsName().get(i);
                winner.add(carName.getName());
            }
        }

        return winner;
    }

    private int getMaxPosition(){
        int max = 0;
        for(int i = startIndex; i < cars.getCarsSize(); i++) {
            Position carPosition = cars.getCarsPosition().get(i);
            if(max < carPosition.getPosition())
                max = carPosition.getPosition();
        }

        return max;
    }

}