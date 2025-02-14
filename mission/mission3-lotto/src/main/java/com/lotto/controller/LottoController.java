package com.lotto.controller;

import com.lotto.domain.TicketCounter;
import com.lotto.view.InputView;
import com.lotto.view.OutputView;

public class LottoController {

    private final InputView inputView;
    private final OutputView outputView;

    private final TicketCounter counter;

    public LottoController(InputView inputView, OutputView outputView, TicketCounter counter) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.counter = counter;
    }
}
