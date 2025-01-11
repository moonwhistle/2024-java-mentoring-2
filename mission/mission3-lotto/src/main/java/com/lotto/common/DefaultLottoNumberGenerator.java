package com.lotto.common;

public class DefaultLottoNumberGenerator implements LottoNumberGenerator {
    private final LottoConfig lottoConfig;

    public DefaultLottoNumberGenerator(LottoConfig lottoConfig) {
        this.lottoConfig = lottoConfig;
    }

    public int getLottoNumber() {
        return (int) (Math.random() * lottoConfig.getMaxLottoNumber()) + lottoConfig.getMinLottoNumber();
    }
}
