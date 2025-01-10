package com.lotto.controller;

import com.lotto.controller.dto.PurchaseAmountDTO;
import com.lotto.controller.dto.PurchaseLottoDTO;

import com.lotto.service.LottoService;

import com.lotto.view.InputView;
import com.lotto.view.OutputView;

import java.util.List;
import java.util.Set;

public class LottoController {
    private final InputView inputView;
    private final OutputView outputview;
    private final LottoService lottoService;

    public LottoController() {
        this.inputView = new InputView();
        this.outputview = new OutputView();
        this.lottoService = new LottoService();
    }

    public void manageLottoProcess() {
        PurchaseLottoDTO purchaseLottoDTO = lottoService.buildLotto(getPurchaseAmountDTO());

        showPurchasedLotto(getPurchaseLotto(purchaseLottoDTO));
    }

    private PurchaseAmountDTO getPurchaseAmountDTO() {
        String purchaseAmount = getPurchaseAmountFromView();

        return new PurchaseAmountDTO(purchaseAmount);
    }

    private String getPurchaseAmountFromView() {
        outputview.showPurchaseAmount();

        return inputView.getInput();
    }

    private List<Set<Integer>> getPurchaseLotto(PurchaseLottoDTO purchaseLottoDTO) {
        return purchaseLottoDTO.purchasedLotto();
    }

    private void showPurchasedLotto(List<Set<Integer>> purchasedLotto) {
        outputview.showPurchaseHistory(purchasedLotto.size());

        for(Set<Integer> lotto : purchasedLotto){
            outputview.showLotto(lotto);
        }
    }
}
