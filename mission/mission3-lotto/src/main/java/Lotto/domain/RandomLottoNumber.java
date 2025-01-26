package Lotto.domain;

import randomNumber.RandomNumberGenerator;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RandomLottoNumber implements RandomNumberGenerator {

    private static final int limit = 45;

    @Override
    public List<LottoNumber> generateNumberList(){
        return IntStream.range(0, Lotto.lottoElementNumber)
                .mapToObj(i -> new LottoNumber(random.nextInt(limit) + 1))
                .collect(Collectors.toList());
    }


}
