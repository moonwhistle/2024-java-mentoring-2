package com.lotto.controller;

import com.lotto.controller.dto.PurchaseAmountDTO;
import com.lotto.controller.dto.PurchaseLottoDTO;

import com.lotto.service.LottoService;

import com.lotto.view.InputView;
import com.lotto.view.OutputView;

public class LottoController {
    private final InputView inputView;
    private final OutputView outputview;
    private final LottoService lottoService;

    public LottoController(InputView inputView, OutputView outputview, LottoService lottoService) {
        this.inputView = inputView;
        this.outputview = outputview;
        this.lottoService = lottoService;
    }

    public void manageLottoProcess() {
        showPurchaseAmount();
        String purchaseAmountFromUser = getPurchaseAmountFromView();

        PurchaseAmountDTO purchaseAmountDTO = getPurchaseAmountDTO(purchaseAmountFromUser);
        PurchaseLottoDTO purchaseLottoDTO = lottoService.buildLotto(purchaseAmountDTO);

        showPurchasedLottoAmount(purchaseLottoDTO.purchasedLottoAmount());
        showPurchaseLotto(purchaseLottoDTO.purchasedLotto());
    }

    private PurchaseAmountDTO getPurchaseAmountDTO(String purchaseAmount) {
        return new PurchaseAmountDTO(purchaseAmount);
    }

    private void showPurchaseAmount() {
        outputview.showPurchaseAmount();
    }

    private String getPurchaseAmountFromView() {
        return inputView.getInput();
    }

    private void showPurchasedLottoAmount(int purchasedLottoAmount) {
        outputview.showPurchaseHistory(purchasedLottoAmount);
    }

    private void showPurchaseLotto(String purchasedLotto) {
        outputview.showLotto(purchasedLotto);
    }
}
