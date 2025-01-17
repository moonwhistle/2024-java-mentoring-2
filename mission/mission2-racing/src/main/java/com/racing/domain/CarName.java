package com.racing.domain;

public class CarName {

    private final String carName;

    public CarName(final String carName) {
        this.carName = carName;
    }

    public String getCarName() {
        return carName;
    }

    private void validateIsNotEmpty(final String carName) {
        if (carName == null || carName.length() == 0) {
            throw new IllegalArgumentException("차의 이름은 빈값이 될 수 없습니다.");
        }
    }
}
