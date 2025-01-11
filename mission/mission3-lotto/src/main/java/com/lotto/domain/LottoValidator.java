package com.lotto.domain;

import com.lotto.domain.exception.InvalidLottoNumberCountException;

import java.util.Set;

public class LottoValidator {
    private final int expectedSize;

    public LottoValidator(int expectedSize) {
        this.expectedSize = expectedSize;
    }

    public void validate(Set<Integer> lottoNumbers) {
        if (lottoNumbers.size() != expectedSize) {
            throw new InvalidLottoNumberCountException("로또 번호 개수가 유효하지 않습니다.");
        }
    }
}
