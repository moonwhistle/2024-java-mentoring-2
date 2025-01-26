package randomNumber;

import Lotto.domain.LottoNumber;

import java.util.List;
import java.util.Random;

public interface RandomNumberGenerator {

    Random random = new Random();

    List<LottoNumber> generateNumberList();

}
