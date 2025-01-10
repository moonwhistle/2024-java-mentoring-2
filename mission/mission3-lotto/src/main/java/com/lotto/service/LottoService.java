package com.lotto.service;

import com.lotto.controller.dto.PurchaseAmountDTO;
import com.lotto.controller.dto.PurchaseLottoDTO;

import com.lotto.domain.IntegerParser;
import com.lotto.domain.LottoLogic;
import com.lotto.domain.vo.Lotto;

import java.util.List;

public class LottoService {
    private final IntegerParser integerParser;
    private final LottoLogic lottoLogic;

    public LottoService() {
        this.integerParser = new IntegerParser();
        this.lottoLogic = new LottoLogic();
    }

    public PurchaseLottoDTO buildLotto(PurchaseAmountDTO purchaseAmountDTO) {
        int availableAmount = calculateAvailableAmount(purchaseAmountDTO);

        List<Lotto> purchasedLotto = lottoLogic.loopAvailableAmount(availableAmount);

        return new PurchaseLottoDTO(purchasedLotto);
    }

    private int calculateAvailableAmount(PurchaseAmountDTO purchaseAmountDTO) {
        String stringPurchaseAmount = purchaseAmountDTO.purchaseAmount();

        int purchaseAmount = integerParser.parseInteger(stringPurchaseAmount);

        return lottoLogic.getAvailableAmount(purchaseAmount);
    }
}
