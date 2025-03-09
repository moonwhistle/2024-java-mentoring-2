package com.lotto;

import com.lotto.service.LottoTicketService;
import com.lotto.service.WinningStatisticsService;

import com.lotto.view.InputView;
import com.lotto.view.OutputView;

import com.lotto.controller.LottoController;

public class LottoApplication {

    public static void main(String[] args) {
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();

        LottoTicketService lottoTicketService = new LottoTicketService();
        WinningStatisticsService winningStatisticsService = new WinningStatisticsService();

        LottoController lottoController = new LottoController(inputView, outputView, lottoTicketService, winningStatisticsService);

        lottoController.runLottoApp();
    }

}
