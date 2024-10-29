package domain;

import java.util.Random;

public class RacingCar {

    int location = 0;

    public int randomNumber(){
        Random number = new Random();
        return number.nextInt(10);
    }

    public int moveCar(int random) {
        if (random >= 4) {
            location++;
        }
        return location;
    }

}
