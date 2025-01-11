package com.lotto;

import com.lotto.controller.LottoController;
import com.lotto.service.LottoService;
import com.lotto.view.InputView;
import com.lotto.view.OutputView;

public class LottoApplication {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();
        LottoService lottoService = new LottoService();

        LottoController lottoController = new LottoController(inputView, outputView, lottoService);
        lottoController.manageLottoProcess();
    }
}
