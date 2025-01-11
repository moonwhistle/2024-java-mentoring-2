package com.lotto.domain;

import com.lotto.common.LottoConfig;
import com.lotto.common.LottoNumberGenerator;

import com.lotto.domain.vo.Lotto;
import com.lotto.domain.vo.PurchasedLotto;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LottoLogic {
    private final LottoConfig lottoConfig;
    private final LottoNumberGenerator lottoNumberGenerator;
    private final IntegerParser integerParser;

    public LottoLogic(LottoConfig lottoConfig, LottoNumberGenerator lottoNumberGenerator) {
        this.lottoConfig = lottoConfig;
        this.lottoNumberGenerator = lottoNumberGenerator;
        this.integerParser = new IntegerParser(lottoConfig);
    }

    public int getAvailableAmount(String stringPurchaseAmount) {
        int purchaseAmount = integerParser.parseInteger(stringPurchaseAmount);

        return purchaseAmount / lottoConfig.getLottoPrice();
    }

    public PurchasedLotto loopAvailableAmount(int availableAmount) {
        List<Lotto> purchaseLotto = new ArrayList<>();

        for (int i = 0; i < availableAmount; i++) {
            Lotto lotto = getLotto();
            purchaseLotto.add(lotto);
        }

        return new PurchasedLotto(purchaseLotto);
    }

    public Lotto getLotto() {
        Set<Integer> lottoNumbersSet = new HashSet<>();

        while (lottoNumbersSet.size() != lottoConfig.getLottoTicketNumberCountLimit()) {
            int lottoNumber = lottoNumberGenerator.getLottoNumber();
            lottoNumbersSet.add(lottoNumber);
        }

        return new Lotto(lottoNumbersSet, lottoConfig);
    }
}
