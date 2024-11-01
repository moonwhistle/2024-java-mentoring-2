package domain;

import java.util.Random;

public class RandomNumberGenerator implements RandomNumber{

    private Random number = new Random();

    public int getRandomNumber() {
        return number.nextInt(10);
    }
}
