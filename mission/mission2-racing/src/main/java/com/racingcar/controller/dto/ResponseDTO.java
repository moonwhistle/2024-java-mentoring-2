package com.racingcar.controller.dto;

import java.util.List;

public class ResponseDTO {
    private final List<String> winnerList;

    private ResponseDTO(List<String> winnerList) {
        this.winnerList = winnerList;
    }

    private String getFormattedWinners() {
        return String.join(", ", this.winnerList); // 쉼표로 구분된 문자열 반환
    }

    public String getWinners() {
        return getFormattedWinners();
    }
}
