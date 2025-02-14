package com.lotto.domain.Lotto;

import java.util.List;

public class LottoTicket {

    private final List<Integer> lotteryNumbers;

    public LottoTicket(final List<Integer> lotteryNumbers) {
        this.lotteryNumbers = lotteryNumbers;
    }

    public List<Integer> getLotteryNumbers() {
        return lotteryNumbers;
    }
}
