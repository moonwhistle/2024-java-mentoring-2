package com.racing.domain;

public class Car{

    private final int StartPosition = 0;
    private final int moveFront = 1;
    private final int notMove = 0;
    private final int bound = 4;
    private int position;
    private String carName;
    private final GenerateRandom generateRandom;

    public Car(final String carName, GenerateRandom generateRandom)
    {
        this.carName = carName;
        this.position = StartPosition;
        this.generateRandom = generateRandom;
    }

    public int getRandomNumber(){
        return generateRandom.generateRandomNumber();
    }

    public void getPosition(){
        System.out.println(this.position);;
    }

    public void carMove(int move){
        this.position += move;
    }

    public int checkMove(int random){
        return validateRandomNumbers(random);
    }

    public int validateRandomNumbers(final int random){
        if(random >= bound)
            return moveFront;
        return notMove;
    }
}
