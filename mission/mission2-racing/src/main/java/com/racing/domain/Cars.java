package com.racing.domain;

import com.racing.dto.CarsDto;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    private final int startIndex = 0;
    private final List<Car> carList;
    private final GenerateRandom generateRandom;
    private final int maxCarNumber = 5;
    private final String splitString = ",";

    public Cars(String inputName, GenerateRandom generateRandom){
        this.generateRandom = generateRandom;
        List<String> inputNames = List.of(inputName.split(splitString));
        Car[] carArray = new Car[inputNames.size()];

        for(int i = startIndex; i < inputNames.size(); i++){
            Name carName = new Name(inputNames.get(i));
            CarsDto carsDto = new CarsDto(carName, generateRandom);
            carArray[i] = new Car(carsDto);
        }

        carList = List.of(carArray);
    }

    public void carsMoveOne(){
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

    public List<String> winner(){
        List<CarsDto> winner= winnerDto(getMaxPosition());
        return winner.stream()
                .map(CarsDto -> CarsDto.carName().getName())
                .toList();
    }

    private List<CarsDto> winnerDto(int maxPosition){
        List<CarsDto> carWinner = new ArrayList<>();
        for(int i = startIndex; i < carList.size(); i++){
            Position position = carList.get(i).getPosition();
            if(position.isMax(getMaxPosition())){
                carWinner.add(new CarsDto(carList.get(i).getCarName(), generateRandom));
            }
        }
        return carWinner;
    }

    private int getMaxPosition(){
        int max = 0;
        for(int i = startIndex; i < getCarsSize(); i++) {
            Position carPosition = getCarsPosition().get(i);
            if(max < carPosition.getPosition())
                max = carPosition.getPosition();
        }
        return max;
    }

}
