package randomNumber;

import java.util.ArrayList;
import java.util.Random;

public interface RandomNumberGenerator {

    public static Random random = new Random();

    ArrayList<Integer> generateNumberList();

}
