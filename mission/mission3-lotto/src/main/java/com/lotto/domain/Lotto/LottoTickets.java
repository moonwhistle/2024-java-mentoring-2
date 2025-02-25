package com.lotto.domain.Lotto;

import com.lotto.domain.number.LottoNumberGenerator;

import java.util.List;

public class LottoTickets {

    private List<LottoTicket> lottoTickets;
    private final LottoNumberGenerator lottoNumberGenerator;

    public LottoTickets(final List<LottoTicket> lottoTickets, final LottoNumberGenerator lottoNumberGenerator) {
        this.lottoTickets = lottoTickets;
        this.lottoNumberGenerator = lottoNumberGenerator;
    }

    public List<LottoTicket> saveLottoTickets(int numberOfTickets) {
        for (int i = 0; i < numberOfTickets; i++) {
            List<Integer> lottoTicket = lottoNumberGenerator.generateRandomNumbers();
            saveLottoTicket(lottoTicket);
        }
        return lottoTickets;
    }

    private void saveLottoTicket(List<Integer> lottoNumbers) {
        lottoTickets.add(new LottoTicket(lottoNumbers));
    }
}
