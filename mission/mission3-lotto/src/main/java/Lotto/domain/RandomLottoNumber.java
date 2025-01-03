package Lotto.domain;

import randomNumber.RandomNumberGenerator;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RandomLottoNumber implements RandomNumberGenerator {

    public static final int limit = 45;
    public static final int lottoElementNumber = 6;

    @Override
    public List<LottoNumber> generateNumberList(){
        return IntStream.range(0, lottoElementNumber)
                .mapToObj(i -> new LottoNumber(random.nextInt(limit) + 1))
                .collect(Collectors.toList());
    }


}
