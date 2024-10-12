package com.racing.domain;

import java.util.Random;

public interface GenerateRandom {

    int limitNumber = 10;

    public static Random random = new Random();

    abstract int generateRandomNumber();

}
