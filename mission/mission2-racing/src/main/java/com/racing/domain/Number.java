package com.racing.domain;

public class Number {

    private int number;

    public Number(int number){
        this.number = number;
    }

    public int getNumber(){
        return this.number;
    }

    public boolean isMove(int requiredCondition){
        return this.number == requiredCondition;
    }

}
