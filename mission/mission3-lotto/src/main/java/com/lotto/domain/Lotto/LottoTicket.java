package com.lotto.domain.Lotto;

import com.lotto.exception.TicketLengthException;

import java.util.List;

public class LottoTicket {

    private static final int NUMBER_OF_LOTTO_NUMBERS = 6;

    private final List<Integer> lotteryNumbers;

    public LottoTicket(final List<Integer> lotteryNumbers) {
        validateTicketLength(lotteryNumbers);
        this.lotteryNumbers = lotteryNumbers;
    }

    public List<Integer> getLotteryNumbers() {
        return lotteryNumbers;
    }

    @Override
    public String toString() {
        return lotteryNumbers.toString();
    }

    private void validateTicketLength(List<Integer> lotteryNumbers) {
        if (lotteryNumbers.size() < NUMBER_OF_LOTTO_NUMBERS) {
            throw new TicketLengthException();
        }
    }
}
