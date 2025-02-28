package com.lotto;

import com.lotto.controller.LottoController;

import com.lotto.view.InputView;
import com.lotto.view.OutputView;

public class LottoApplication {

    public static void main(String[] args) {
        LottoController lottoController = new LottoController(new InputView(), new OutputView());
        lottoController.run();
    }
}
