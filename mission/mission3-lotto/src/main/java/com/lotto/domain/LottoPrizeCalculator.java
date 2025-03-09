package com.lotto.domain;

import com.lotto.common.LottoResultConfig;

import java.util.Arrays;

public class LottoPrizeCalculator {

    public static int getPrize(int matchCount, boolean bonus) {
        return Arrays.stream(LottoResultConfig.values())
                .filter(config -> config.getMatchCount() == matchCount && config.getBonus() == bonus)
                .findFirst()
                .map(LottoResultConfig::getPrizeMoney)
                .orElse(0);
    }

}
