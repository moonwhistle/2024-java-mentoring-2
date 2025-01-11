package com.lotto.common;

public class DefaultLottoConfig implements LottoConfig {
    private static final int LOTTO_PRICE = 1000;
    private static final int LOTTO_NUMBER_COUNT_LIMIT = 6;
    private static final int MIN_LOTTO_NUMBER = 1;
    private static final int MAX_LOTTO_NUMBER = 45;

    public int getLottoPrice() {
        return LOTTO_PRICE;
    }

    public int getLottoTicketNumberCountLimit() {
        return LOTTO_NUMBER_COUNT_LIMIT;
    }

    public int getMinLottoNumber() {
        return MIN_LOTTO_NUMBER;
    }

    public int getMaxLottoNumber() {
        return MAX_LOTTO_NUMBER;
    }
}
