package com.lotto.common;

public enum LottoResultConfig {

    FIRST_PLACE(6, false, "6개 일치 (2000000000원)", 2000000000),
    SECOND_PLACE(5, true, "5개 일치, 보너스 볼 일치(30000000원)", 30000000),
    THIRD_PLACE(5, false, "5개 일치 (1500000원)", 1500000),
    FOURTH_PLACE(4, false, "4개 일치 (50000원)", 50000),
    FIFTH_PLACE(3, false, "3개 일치 (5000원)", 5000);

    private final int matchCount;
    private final boolean bonus;
    private final String message;
    private final int prizeMoney;

    LottoResultConfig(int matchCount, boolean bonus, String message, int prizeMoney) {
        this.matchCount = matchCount;
        this.bonus = bonus;
        this.message = message;
        this.prizeMoney = prizeMoney;
    }

    public int getMatchCount() {
        return matchCount;
    }

    public boolean getBonus() {
        return bonus;
    }

    public String getMessage() {
        return message;
    }

    public int getPrizeMoney() {
        return prizeMoney;
    }

}
