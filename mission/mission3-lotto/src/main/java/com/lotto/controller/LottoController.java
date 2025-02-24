package com.lotto.controller;

import com.lotto.domain.Lotto.LottoTicket;
import com.lotto.domain.Lotto.LottoTickets;
import com.lotto.domain.TicketCounter;
import com.lotto.domain.number.LottoNumberGenerator;

import com.lotto.view.InputView;
import com.lotto.view.OutputView;

import java.util.ArrayList;
import java.util.List;

public class LottoController {

    private final InputView inputView;
    private final OutputView outputView;

    public LottoController(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void run() {
        int money = inputView.receivePriceToBuy();
        int numberOfTickets = TicketCounter.calculateCount(money);
        outputView.showNumberOfTickets(numberOfTickets);
        LottoTickets lottoTickets = new LottoTickets(new ArrayList<>(), new LottoNumberGenerator());
        List<LottoTicket> lottoNumbers = lottoTickets.createLottoTickets(numberOfTickets);
        outputView.showLottoTickets(lottoNumbers);
    }
}
