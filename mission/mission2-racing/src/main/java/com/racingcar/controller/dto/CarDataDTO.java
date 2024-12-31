package com.racingcar.controller.dto;

import java.util.ArrayList;

public class CarDataDTO {
    private final ArrayList<String> carNames;
    private final int tryCount;

    public CarDataDTO(ArrayList<String> carNames, int tryCount) {
        this.carNames = carNames;
        this.tryCount = tryCount;
    }

    public ArrayList<String> getCarName() {
        return carNames;
    }

    public int getTryCount() {
        return tryCount;
    }
}
