package com.lotto.view;

import com.lotto.domain.Lotto.LottoTicket;

import java.util.List;

public class OutputView {

    public void showNumberOfTickets(int numberOfTickets) {
        System.out.println("\n" + numberOfTickets + "개를 구매했습니다.");
    }

    public void showLottoTickets(List<LottoTicket> lottoTickets) {
        for(LottoTicket lottoTicket : lottoTickets) {
            System.out.println(lottoTicket.getLotteryNumbers());
        }
    }
}
