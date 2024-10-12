package com.racing.domain;

public class Car{

    private final int StartPosition = 0;
    private final int moveFront = 1;
    private final int notMove = 0;
    private final int bound = 4;
    private int position;
    private String carName;
    private final GenerateRandom generateRandom;

    public Car(String carName, GenerateRandom generateRandom)
    {
        this.carName = carName;
        this.generateRandom = generateRandom;
    }

    public int getRandomNumber(){
        return generateRandom.generateRandomNumber();
    }

    public int getPosition(){
        return this.position;
    }

    public void carMove(int randomNumber){
        if(validateRandomNumbers(randomNumber) == moveFront)
            moveFront();
    }

    private void moveFront(){
        this.position++;
    }

    private int validateRandomNumbers(final int random){
        if(random >= bound)
            return moveFront;
        return notMove;
    }
}
