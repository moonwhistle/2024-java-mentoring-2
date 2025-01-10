package com.lotto.domain;

public class LottoNumberGenerator {
    public int getLottoNumber() {
        return (int) (Math.random() * 45) + 1;
    }
}
