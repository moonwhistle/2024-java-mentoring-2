package com.lotto.domain;

import com.lotto.common.LottoConfig;
import com.lotto.common.RandomNumberGenerator;
import com.lotto.domain.vo.Lotto;

import java.util.HashSet;
import java.util.Set;

public class LottoTicketGenerator {
    private final LottoConfig lottoConfig;
    private final RandomNumberGenerator randomNumberGenerator;

    public LottoTicketGenerator(LottoConfig lottoConfig, RandomNumberGenerator randomNumberGenerator) {
        this.lottoConfig = lottoConfig;
        this.randomNumberGenerator = randomNumberGenerator;
    }

    public Lotto getLottoTicket() {
        Set<Integer> lottoNumbers = getLottoNumberSet();

        return new Lotto(lottoNumbers);
    }

    private Set<Integer> getLottoNumberSet() {
        Set<Integer> lottoNumbersSet = new HashSet<>();

        return getRandomLottoNumber(lottoNumbersSet);
    }

    private Set<Integer> getRandomLottoNumber(Set<Integer> lottoNumbersSet) {
        while (lottoNumbersSet.size() != lottoConfig.getLottoTicketNumberCountLimit()) {
            int lottoNumber = randomNumberGenerator.getRandomNumber();
            lottoNumbersSet.add(lottoNumber);
        }

        return lottoNumbersSet;
    }
}
