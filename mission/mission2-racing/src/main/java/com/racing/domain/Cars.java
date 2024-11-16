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

    public String carsMoveAll(int startIndex, int endIndex){
        StringBuilder sb = new StringBuilder();
        for(int i = startIndex; i < endIndex; i++){
            carsMoveOne();
            sb.append(carsDetail());
        }
        return sb.toString();
    }

    public String carsDetail(){
        StringBuilder carDetail = new StringBuilder();
        for(int i = startIndex; i < carList.size(); i++){
            Name carName = carList.get(i).getCarName();
            Position carPosition = carList.get(i).getPosition();
            carDetail.append(carName.getName() + " : ");

            String position = signOfCarPosition(carPosition);
            carDetail.append(position);

            carDetail.append("\n");
        }
        carDetail.append("\n");

        return carDetail.toString();
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

    private String signOfCarPosition(Position carPosition){
        StringBuilder sb = new StringBuilder();
        for(int i = startIndex ; i < carPosition.getPosition(); i++){
            sb.append("-");
        }
        return sb.toString();
    }

}
