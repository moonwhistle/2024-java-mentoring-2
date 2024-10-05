package com.racing.domain;
import java.util.Random;
public class Car {

    private final String Car_name;
    private int position;
    public Car(String Car_name, int position){
        this.Car_name = Car_name;
        this.position = position;
    }

    private static int generate_random(){
        Random random = new Random();
        return random.nextInt(9);
    }

    private int range_random(){
        int random = generate_random();
        if(random >= 4)
            return 1;
        return -1;
    }

    public void Car_move(){
        int move = range_random();
        this.position += move;
    }
}
