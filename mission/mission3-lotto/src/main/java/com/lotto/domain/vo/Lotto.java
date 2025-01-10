package com.lotto.domain.vo;

import java.util.Set;

public class Lotto {
    private final Set<Integer> lottoNumbers;

    public Lotto(Set<Integer> lottoNumbers) {
        if (lottoNumbers.size() != 6) {
            throw new Error();
        }
        this.lottoNumbers = lottoNumbers;
    }

    public Set<Integer> getLotto() {
        return this.lottoNumbers;
    }
}
