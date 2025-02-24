package com.lotto.domain;

public class TicketCounter {

    private static final int PRICE_OF_LOTTERY = 1000;

    public static int calculateCount(int money) {
        return money / PRICE_OF_LOTTERY;
    }
}
