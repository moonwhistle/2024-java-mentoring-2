package com.racingcar.controller.dto;

public class RequestDTO {
    private final String carNames;
    private final String tryCount;

    public RequestDTO(String carNames, String tryCount) {
        this.carNames = carNames;
        this.tryCount = tryCount;
    }

    public String getCarNames() {
        return carNames;
    }

    public String getTryCount() {
        return tryCount;
    }
}