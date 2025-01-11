package com.lotto;

import com.lotto.common.DefaultLottoConfig;
import com.lotto.common.DefaultLottoNumberGenerator;
import com.lotto.common.LottoConfig;
import com.lotto.common.RandomNumberGenerator;

import com.lotto.controller.LottoController;

import com.lotto.service.LottoService;

import com.lotto.view.InputView;
import com.lotto.view.OutputView;

public class LottoApplication {
    public static void main(String[] args) {
        LottoConfig defaultLottoConfig = new DefaultLottoConfig();
        RandomNumberGenerator lottoRandomNumberGenerator = new DefaultLottoNumberGenerator();

        InputView inputView = new InputView();
        OutputView outputView = new OutputView();

        LottoService lottoService = new LottoService(defaultLottoConfig, lottoRandomNumberGenerator);

        LottoController lottoController = new LottoController(inputView, outputView, lottoService);
        lottoController.manageLottoProcess();
    }
}
