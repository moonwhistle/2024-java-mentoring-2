package com.lotto.domain.Lotto;

import com.lotto.exception.TicketLengthException;

import java.util.List;

public class LottoTicket {

    private final List<Integer> lotteryNumbers;

    public LottoTicket(final List<Integer> lotteryNumbers) {
        validateTicketLength(lotteryNumbers);
        this.lotteryNumbers = lotteryNumbers;
    }

    public List<Integer> getLotteryNumbers() {
        return lotteryNumbers;
    }

    private void validateTicketLength(List<Integer> lotteryNumbers) {
        if (lotteryNumbers.size() < 6) {
            throw new TicketLengthException();
        }
    }
}
