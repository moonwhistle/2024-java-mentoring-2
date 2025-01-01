package com.racingcar.domain;

public class Car {

    private final String name;
    private int position;

    public Car(final String name){
        this.name = name;
        this.position = 0;
    }

    public void move(int moveState){
        this.position += moveState;
    }

    public String getName(){
        return this.name;
    }

    public int getPosition(){
        return this.position;
    }
}
