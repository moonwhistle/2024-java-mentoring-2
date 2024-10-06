package com.racing.domain;

import java.util.Random;
public class Car {

    private final String carName;
    private final Random random;
    private int position;

    public Car(String carName, int position, Random random){
        this.carName = carName;
        this.position = position;
        this.random = random;
    }

    private int generate_random(){
        return random.nextInt(9);
    }

    private int checkMove(){
        int random = generate_random();
        if(random >= 4)
            return 1;
        return 0;
    }

    public void car_move(){
        int move = checkMove();
        this.position += move;
    }
}
