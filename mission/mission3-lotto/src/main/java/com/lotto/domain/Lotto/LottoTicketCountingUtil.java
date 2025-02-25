package com.lotto.domain.Lotto;

public final class LottoTicketCountingUtil {

    private static final int PRICE_OF_LOTTO_TICKET = 1000;

    private LottoTicketCountingUtil() {
        throw new UnsupportedOperationException("Utility Class임.");
    }

    public static int calculateTicketCount(int money) {
        return money / PRICE_OF_LOTTO_TICKET;
    }
}
