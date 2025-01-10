package com.lotto.service;

import com.lotto.controller.dto.PurchaseAmountDTO;

import com.lotto.domain.IntegerParser;
import com.lotto.domain.LottoLogic;

public class LottoService {
    private final IntegerParser integerParser;
    private final LottoLogic lottoLogic;

    public LottoService(){
        this.integerParser = new IntegerParser();
        this.lottoLogic = new LottoLogic();
    }

    public void buildLotto(PurchaseAmountDTO purchaseAmountDTO) {
        int availableAmount = calculateAvailableAmount(purchaseAmountDTO);

    }

    private int calculateAvailableAmount(PurchaseAmountDTO purchaseAmountDTO) {
        String stringPurchaseAmount = purchaseAmountDTO.purchaseAmount();

        int purchaseAmount = integerParser.parseInteger(stringPurchaseAmount);

        return lottoLogic.getAvailableAmount(purchaseAmount);
    }
}
