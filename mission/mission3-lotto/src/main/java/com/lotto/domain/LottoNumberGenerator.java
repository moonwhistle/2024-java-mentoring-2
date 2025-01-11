package com.lotto.domain;

import com.lotto.common.LottoConfig;

public class LottoNumberGenerator {

    private final LottoConfig lottoConfig;

    public LottoNumberGenerator(LottoConfig lottoConfig) {
        this.lottoConfig = lottoConfig;
    }

    public int getLottoNumber() {
        return (int) (Math.random() * lottoConfig.getMaxLottoNumber()) + lottoConfig.getMinLottoNumber();
    }
}
