package com.lotto.service;

import com.lotto.controller.dto.PurchaseAmountDTO;
import com.lotto.controller.dto.PurchaseLottoDTO;

import com.lotto.domain.IntegerParser;
import com.lotto.domain.LottoLogic;
import com.lotto.domain.vo.PurchasedLotto;

public class LottoService {
    private final IntegerParser integerParser;
    private final LottoLogic lottoLogic;

    public LottoService() {
        this.integerParser = new IntegerParser();
        this.lottoLogic = new LottoLogic();
    }

    public PurchaseLottoDTO buildLotto(PurchaseAmountDTO purchaseAmountDTO) {
        int availableAmount = calculateAvailableAmount(purchaseAmountDTO);

        PurchasedLotto purchasedLotto = lottoLogic.loopAvailableAmount(availableAmount);

        return getPurchaseLottoDTO(purchasedLotto);
    }

    private PurchaseLottoDTO getPurchaseLottoDTO(PurchasedLotto purchasedLotto) {
        String stringPurchasedLotto = lottoLogic.stringifyLottoList(purchasedLotto.getPurchasedLotto());
        int lottoAmount = purchasedLotto.getPurchasedLottoAmount();

        return new PurchaseLottoDTO(stringPurchasedLotto, lottoAmount);
    }

    private int calculateAvailableAmount(PurchaseAmountDTO purchaseAmountDTO) {
        String stringPurchaseAmount = purchaseAmountDTO.purchaseAmount();

        int purchaseAmount = integerParser.parseInteger(stringPurchaseAmount);

        return lottoLogic.getAvailableAmount(purchaseAmount);
    }
}
