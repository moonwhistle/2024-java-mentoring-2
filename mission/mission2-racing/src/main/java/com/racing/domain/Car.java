package com.racing.domain;

import com.racing.dto.CarsDto;

public class Car{

    private final int moveFront = 1;
    private final int notMove = 0;
    private final int bound = 4;
    private final int limitNumber = 6;
    private Position position = new Position();
    private Name carName;
    private final GenerateRandom generateRandom;

    public Car(CarsDto carsDto) {
        this.carName = carsDto.getCarName();
        this.generateRandom = carsDto.getGenerateRandom();
    }

    public Car(Name carName, GenerateRandom generateRandom)
    {
        if(carName.getName().length() >= limitNumber)
            throw new IllegalArgumentException();

        this.carName = carName;
        this.generateRandom = generateRandom;
    }

    public Number getRandomNumber(){
        return generateRandom.generateRandomNumber();
    }

    public Position getPosition(){
        return this.position;
    }

    public Name getCarName(){
        return this.carName;
    }

    public void carMove(Number number){
        if(number.isMove(moveFront))
            moveFront();
    }

    public Number moveOrStop(Number randomNumber){
        return validateRandomNumbers(randomNumber);
    }

    private Number validateRandomNumbers(final Number random){
        if(random.getNumber() >= bound)
            return new Number(moveFront);
        return new Number(notMove);
    }

    private void moveFront(){
        this.position.movePosition();
    }

}
