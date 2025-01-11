package com.lotto;

import com.lotto.common.DefaultLottoConfig;
import com.lotto.common.LottoConfig;

import com.lotto.controller.LottoController;

import com.lotto.service.LottoService;

import com.lotto.view.InputView;
import com.lotto.view.OutputView;

public class LottoApplication {
    public static void main(String[] args) {
        LottoConfig lottoConfig = new DefaultLottoConfig();

        InputView inputView = new InputView();
        OutputView outputView = new OutputView();
        LottoService lottoService = new LottoService(lottoConfig);

        LottoController lottoController = new LottoController(inputView, outputView, lottoService);
        lottoController.manageLottoProcess();
    }
}
