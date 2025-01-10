package com.lotto.domain.vo;

import com.lotto.domain.ErrorMessage;
import com.lotto.domain.exception.InvalidLottoNumberCountException;

import java.util.Set;

public class Lotto {
    private final Set<Integer> lottoNumbers;

    public Lotto(Set<Integer> lottoNumbers) {
        if (lottoNumbers.size() != 6) {
            throw new InvalidLottoNumberCountException(ErrorMessage.INVALID_LOTTO_NUMBER_COUNT_ERROR.getMessage());
        }
        this.lottoNumbers = lottoNumbers;
    }

    public Set<Integer> getLotto() {
        return this.lottoNumbers;
    }
}
