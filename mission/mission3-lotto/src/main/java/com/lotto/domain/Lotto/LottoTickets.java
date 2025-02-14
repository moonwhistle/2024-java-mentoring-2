package com.lotto.domain.Lotto;

import com.lotto.domain.number.LottoNumberGenerator;

import java.util.List;

public class LottoTickets {

    private final List<LottoTicket> lottoTickets;

    public LottoTickets(List<LottoTicket> lottoTickets) {
        this.lottoTickets = lottoTickets;
    }

    public List<LottoTicket> getLottoTickets() {
        return lottoTickets;
    }

    private List<Integer> createLottoTicket(LottoNumberGenerator lottoNumberGenerator) {
        return lottoNumberGenerator.generateRandomNumbers();
    }

    private void saveLottoTicket(List<Integer> lottoNumbers) {
        lottoTickets.add(new LottoTicket(lottoNumbers));
    }
}
