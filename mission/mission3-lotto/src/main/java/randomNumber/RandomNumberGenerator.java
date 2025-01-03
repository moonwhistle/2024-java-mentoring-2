package randomNumber;

import Lotto.domain.LottoNumber;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public interface RandomNumberGenerator {

    public Random random = new Random();

    List<LottoNumber> generateNumberList();

}
