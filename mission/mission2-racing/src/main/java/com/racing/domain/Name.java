package com.racing.domain;

public class Name {

    private String name;
    private final int limitNumber = 6;

    public Name(String name){
        nameException(name);
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void nameException(String inputName){
        if(inputName.length() >= limitNumber)
            throw new IllegalArgumentException();
    }

}
