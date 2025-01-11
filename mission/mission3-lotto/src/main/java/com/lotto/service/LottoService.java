package com.lotto.service;

import com.lotto.common.LottoConfig;
import com.lotto.common.RandomNumberGenerator;

import com.lotto.controller.dto.PurchaseAmountDTO;
import com.lotto.controller.dto.PurchaseLottoDTO;

import com.lotto.domain.LottoLogic;
import com.lotto.domain.LottoTicketGenerator;
import com.lotto.domain.vo.PurchasedLotto;

public class LottoService {
    private final LottoLogic lottoLogic;
    private final LottoTicketGenerator lottoTicketGenerator;

    public LottoService(LottoConfig lottoConfig, RandomNumberGenerator randomNumberGenerator) {
        this.lottoLogic = new LottoLogic(lottoConfig);
        this.lottoTicketGenerator = new LottoTicketGenerator(lottoConfig, randomNumberGenerator);
    }

    public PurchaseLottoDTO buildLotto(PurchaseAmountDTO purchaseAmountDTO) {
        int availableAmount = calculateAvailableAmount(purchaseAmountDTO);
        PurchasedLotto purchasedLotto = getPurchasedLotto(availableAmount);

        return getPurchaseLottoDTO(purchasedLotto);
    }

    private PurchasedLotto getPurchasedLotto(int availableAmount) {
        LottoTicketGenerator lottoTicketGenerator = this.lottoTicketGenerator;

        return lottoLogic.purchaseAvailableLottoTickets(availableAmount, lottoTicketGenerator);
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
