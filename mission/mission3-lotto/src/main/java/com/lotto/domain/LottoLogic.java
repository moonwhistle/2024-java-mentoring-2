package com.lotto.domain;

import com.lotto.common.LottoConfig;

import com.lotto.domain.vo.Lotto;
import com.lotto.domain.vo.PurchasedLotto;

import java.util.ArrayList;
import java.util.List;

public class LottoLogic {
    private final LottoConfig lottoConfig;
    private final IntegerParser integerParser;

    public LottoLogic(LottoConfig lottoConfig) {
        this.lottoConfig = lottoConfig;
        this.integerParser = new IntegerParser(lottoConfig);
    }

    public int getAvailableAmount(String stringPurchaseAmount) {
        int purchaseAmount = integerParser.parseInteger(stringPurchaseAmount);

        return purchaseAmount / lottoConfig.getLottoPrice();
    }

    public PurchasedLotto purchaseAvailableLottoTickets(int availableAmount, LottoTicketGenerator lottoTicketGenerator) {
        List<Lotto> purchasedLotto = new ArrayList<>();

        for (int i = 0; i < availableAmount; i++) {
            purchasedLotto.add(lottoTicketGenerator.getLottoTicket());
        }

        return getPurchasedLotto(purchasedLotto);
    }

    private PurchasedLotto getPurchasedLotto(List<Lotto> purchasedLotto) {
        return new PurchasedLotto(purchasedLotto);
    }
}
