package com.lotto.service;

import com.lotto.controller.dto.PurchaseAmountDTO;

import com.lotto.domain.IntegerParser;
import com.lotto.domain.LottoLogic;

public class LottoService {
    private final IntegerParser integerParser;

    public LottoService(){
        this.integerParser = new IntegerParser();
    }

    public void buildLotto() {

    }

    private int getPurchaseAmount(PurchaseAmountDTO purchaseAmountDTO){
        String stringPurchaseAmount = purchaseAmountDTO.purchaseAmount();

        return integerParser.parseInteger(stringPurchaseAmount);
    }
}
