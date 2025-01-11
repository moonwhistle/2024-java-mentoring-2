package com.lotto.common;

public class DefaultLottoConfig implements LottoConfig {
    private static final int LOTTO_PRICE = 1000;
    private static final int LOTTO_NUMBER_COUNT_LIMIT = 6;

    public int getLottoPrice() {
        return LOTTO_PRICE;
    }

    public int getLottoTicketNumberCountLimit() {
        return LOTTO_NUMBER_COUNT_LIMIT;
    }
}
