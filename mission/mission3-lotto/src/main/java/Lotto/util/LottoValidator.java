package Lotto.util;

import Lotto.common.exception.ExceptionMessage;
import Lotto.domain.Lotto;
import Lotto.domain.LottoNumber;

import java.util.List;
import java.util.stream.Collectors;

import static Lotto.domain.Lotto.lottoElementNumber;

public class LottoValidator {

    public static void validateLottoNumber(List<LottoNumber> lottoNumbers){
        long lottoNumber = numberOfNotDuplicatedNumber(lottoNumbers);
        if(lottoNumber != lottoElementNumber)
            throw new IllegalArgumentException(ExceptionMessage.DUPLICATE_NUMBER.getMessage());
    }

    public static void validateLottos(int inputPrice){
        if(inputPrice < Lotto.lottoPrice)
            throw new IllegalArgumentException(ExceptionMessage.INVALID_LOTTO_NUMBER.getMessage());
    }

    private static List<Integer> toInteger(List<LottoNumber> lottoNumbers){
        return lottoNumbers.stream()
                .map(LottoNumber::getLottoNumber)
                .collect(Collectors.toList());
    }

    private static long numberOfNotDuplicatedNumber(List<LottoNumber> lottoNumbers){
        return toInteger(lottoNumbers).stream()
                .distinct()
                .count();
    }

}

