package com.lotto.domain;

public class LottoNumberGenerator {

    private final LottoConfig lottoConfig;

    public LottoNumberGenerator() {
        this.lottoConfig = new LottoConfig();
    }

    public int getLottoNumber() {
        return (int) (Math.random() * lottoConfig.getMaxLottoNumber()) + lottoConfig.getMinLottoNumber();
    }
}
