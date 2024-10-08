package com.racing.domain;

import java.util.Random;
public class Car implements RandomNumber {

    private final int StartPosition = 0;
    private int position;
    private String carName;

    public Car(final String carName)
    {
        this.carName = carName;
        this.position = StartPosition;
    }

    public int getRandomNumber(){
        return generateRandomNumber();
    }

    public void getPosition(){
        System.out.println(this.position);;
    }

    public void carMove(int move){
        this.position += move;
    }
}
