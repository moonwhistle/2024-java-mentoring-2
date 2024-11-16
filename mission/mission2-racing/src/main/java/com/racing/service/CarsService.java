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

    public List<String> winner(List<Name> winnerName){
        return winnerName.stream()
                .map(Name::getName)
                .toList();
    }

    public List<Name> winnerName(List<Position> position){
        List<Name> winner = new ArrayList<>();
        List<Integer> winnerIndex = addWinner(position);

        for(int i = startIndex; i < winnerIndex.size(); i++){
            int index = winnerIndex.get(i);
            winner.add(cars.getCarsName().get(index));
        }
        return winner;
    }

    private List<Integer> addWinner(List<Position> position){
        List<Integer> winnerIndex = new ArrayList<>();
        for(int i = startIndex; i < position.size(); i++) {
            if(position.get(i).getPosition() == getMaxPosition())
                winnerIndex.add(i);
        }
        return winnerIndex;
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
