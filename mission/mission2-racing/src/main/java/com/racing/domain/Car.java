package com.racing.domain;

public class Car{

    private final int StartPosition = 0;
    private final int moveFront = 1;
    private final int notMove = 0;
    private final int bound = 4;

    private Position position = new Position();
    private Name carName;
    private final GenerateRandom generateRandom;

    public Car(Name carName, GenerateRandom generateRandom)
    {
        this.carName = carName;
        this.generateRandom = generateRandom;
    }

    public int getRandomNumber(){
        return generateRandom.generateRandomNumber();
    }

    public Position getPosition(){
        return this.position;
    }

    public Name getCarName(){
        return this.carName;
    }

    public void carMove(int number){
        if(number == moveFront)
            moveFront();
    }

    public int moveOrStop(int randomNumber){
        return validateRandomNumbers(randomNumber);
    }

    private void moveFront(){
        this.position.movePosition();
    }

    private int validateRandomNumbers(final int random){
        if(random >= bound)
            return moveFront;
        return notMove;
    }

}
