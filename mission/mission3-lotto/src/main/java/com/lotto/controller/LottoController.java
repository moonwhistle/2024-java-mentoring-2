package com.lotto.controller;

import com.lotto.view.InputView;
import com.lotto.view.OutputView;

public class LottoController {
    private final InputView inputView;
    private final OutputView outputview;

    public LottoController() {
        this.inputView = new InputView();
        this.outputview = new OutputView();
    }

    private String getPurchaseAmountFromView() {
        outputview.showPurchaseAmount();

        return inputView.getInput();
    }
}
