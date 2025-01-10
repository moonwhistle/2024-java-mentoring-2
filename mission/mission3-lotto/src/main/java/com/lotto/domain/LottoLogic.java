package com.lotto.domain;

public class LottoLogic {
    private final int LOTTO_PRICE = 1000;

    public int getAvailableAmount(int integer){
        return integer / LOTTO_PRICE;
    }
}
