package com.lotto.service;

import com.lotto.common.LottoNumberGenerator;
import com.lotto.common.LottoConfig;

import com.lotto.controller.dto.PurchaseAmountDTO;
import com.lotto.controller.dto.PurchaseLottoDTO;

import com.lotto.domain.LottoLogic;
import com.lotto.domain.vo.PurchasedLotto;

public class LottoService {
    private final LottoLogic lottoLogic;

    public LottoService(LottoConfig lottoConfig, LottoNumberGenerator lottoNumberGenerator) {
        this.lottoLogic = new LottoLogic(lottoConfig, lottoNumberGenerator);
    }

    public PurchaseLottoDTO buildLotto(PurchaseAmountDTO purchaseAmountDTO) {
        int availableAmount = calculateAvailableAmount(purchaseAmountDTO);
        PurchasedLotto purchasedLotto = lottoLogic.loopAvailableAmount(availableAmount);

        return getPurchaseLottoDTO(purchasedLotto);
    }

    private PurchaseLottoDTO getPurchaseLottoDTO(PurchasedLotto purchasedLotto) {
        String stringPurchasedLotto = purchasedLotto.getStringifyLotto();
        int lottoAmount = purchasedLotto.getPurchasedLottoAmount();

        return new PurchaseLottoDTO(stringPurchasedLotto, lottoAmount);
    }

    private int calculateAvailableAmount(PurchaseAmountDTO purchaseAmountDTO) {
        String stringPurchaseAmount = purchaseAmountDTO.purchaseAmount();

        return lottoLogic.getAvailableAmount(stringPurchaseAmount);
    }
}
