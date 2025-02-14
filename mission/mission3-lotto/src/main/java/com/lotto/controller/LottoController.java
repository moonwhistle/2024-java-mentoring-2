package com.lotto.controller;

import com.lotto.domain.Lotto.LottoTicket;
import com.lotto.domain.Lotto.LottoTickets;
import com.lotto.domain.TicketCounter;

import com.lotto.view.InputView;
import com.lotto.view.OutputView;

import java.util.ArrayList;
import java.util.List;

public class LottoController {

    private final InputView inputView;
    private final OutputView outputView;

    private final TicketCounter counter;

    public LottoController(InputView inputView, OutputView outputView, TicketCounter counter) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.counter = counter;
    }

    public void run() {
        int money = inputView.receivePriceToBuy();
        int numberOfTickets = counter.calculateCount(money);
        outputView.showNumberOfTickets(numberOfTickets);
        List<LottoTicket> lottoNumbers = new ArrayList<>();
        LottoTickets lottoTickets = new LottoTickets(lottoNumbers);
        lottoTickets.createLottoTickets(numberOfTickets);
        outputView.showLottoTickets(lottoNumbers);
    }
}
