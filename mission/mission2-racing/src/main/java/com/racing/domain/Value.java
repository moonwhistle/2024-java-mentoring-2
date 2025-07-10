package com.racing.domain;

public enum Value {
    NEGATIVE_VALUE(0),
    MAX_ZERO_NUMBER(0),
    SPEC_RANG(3),
    MAX_RANDOM_VALUE(10),
    OUT_OF_RANGE(9);

    private final int value;

    Value(int value) {
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}
