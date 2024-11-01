package domain;

import java.util.Random;

public class RacingCar {

    int location = 0;

    public int moveCar(int random) {
        if (random >= 4) {
            location++;
        }
        return location;
    }

}
