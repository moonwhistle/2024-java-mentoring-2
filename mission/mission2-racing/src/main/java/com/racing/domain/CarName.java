package com.racing.domain;

public class CarName {

    private static final int CAR_NAME_LENGTH_MAX = 5;
    private final String carName;

    public CarName(final String carName) {
        validateIsNotEmpty(carName);
        validateNameLength(carName);
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

    private void validateNameLength(final String carName) {
        if (carName.length() > CAR_NAME_LENGTH_MAX) {
            throw new IllegalArgumentException("차 이름은 5자 이하이어야 합니다.");
        }
    }
}
