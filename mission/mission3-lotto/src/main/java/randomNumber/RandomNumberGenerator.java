package randomNumber;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public interface RandomNumberGenerator {

    public Random random = new Random();

    List<Integer> generateNumberList();

}
