package com.racing.domain.car;

public class CarName {

    private final String carName;

    public CarName(final String carName) {
        validateCarName(carName);
        this.carName = carName;
    }

    private void validateCarName(String carName) {
        if (carName == null) {
            throw new IllegalArgumentException("차 이름을 다시 입력하세요.");
        }
    }
}
