package com.racingcar.controller.dto;

import java.util.List;

public class ResponseDTO {
    private final String JOIN_STRING = ", ";

    private final List<String> winnerList;

    public ResponseDTO(List<String> winnerList) {
        this.winnerList = winnerList;
    }

    private String getFormattedWinners() {
        return String.join(JOIN_STRING, this.winnerList);
    }

    public String getWinners() {
        return getFormattedWinners();
    }
}
