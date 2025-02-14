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

    public void createLottoTickets(int numberOfTickets) {
        LottoNumberGenerator lottoNumberGenerator = new LottoNumberGenerator();
        for (int i = 0; i < numberOfTickets; i++) {
            List<Integer> lottoTicket = createLottoTicket(lottoNumberGenerator);
            saveLottoTicket(lottoTicket);
        }
    }

    private List<Integer> createLottoTicket(LottoNumberGenerator lottoNumberGenerator) {
        return lottoNumberGenerator.generateRandomNumbers();
    }

    private void saveLottoTicket(List<Integer> lottoNumbers) {
        lottoTickets.add(new LottoTicket(lottoNumbers));
    }
}
