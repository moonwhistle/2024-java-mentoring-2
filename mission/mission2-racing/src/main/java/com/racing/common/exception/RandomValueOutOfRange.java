package com.racing.common.exception;

public class RandomValueOutOfRange extends IndexOutOfBoundsException {

    public RandomValueOutOfRange(){
        super("Random value is out of range.");
    }
}
