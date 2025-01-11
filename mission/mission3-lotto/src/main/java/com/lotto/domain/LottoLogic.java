package com.lotto.domain;

import com.lotto.common.LottoConfig;
import com.lotto.common.RandomNumberGenerator;

import com.lotto.domain.exception.InvalidLottoNumberCountException;
import com.lotto.domain.vo.Lotto;
import com.lotto.domain.vo.PurchasedLotto;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LottoLogic {
    private final LottoConfig lottoConfig;
    private final RandomNumberGenerator randomNumberGenerator;
    private final IntegerParser integerParser;

    public LottoLogic(LottoConfig lottoConfig, RandomNumberGenerator randomNumberGenerator) {
        this.lottoConfig = lottoConfig;
        this.randomNumberGenerator = randomNumberGenerator;
        this.integerParser = new IntegerParser(lottoConfig);
    }

    public int getAvailableAmount(String stringPurchaseAmount) {
        int purchaseAmount = integerParser.parseInteger(stringPurchaseAmount);

        return purchaseAmount / lottoConfig.getLottoPrice();
    }

    public PurchasedLotto purchaseAvailableLottoTickets(List<Lotto> purchasedLotto) {
        return new PurchasedLotto(purchasedLotto);
    }

    public List<Lotto> loopAvailableAmount(int availableAmount) {
        List<Lotto> purchasedLotto = new ArrayList<>();

        for (int i = 0; i < availableAmount; i++) {
            purchasedLotto.add(getLottoTicket());
        }

        return purchasedLotto;
    }

    private Lotto getLottoTicket() {
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
