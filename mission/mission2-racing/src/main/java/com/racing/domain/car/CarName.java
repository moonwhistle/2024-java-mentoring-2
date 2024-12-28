package com.racing.domain.car;

public class CarName {

    private static final String NAME_ERROR_MESSAGE = "차 이름은 빈 값이 될 수 없습니다.";

    private final String carName;

    public CarName(final String carName) {
        validateCarName(carName);
        this.carName = carName;
    }

    public String getCarName() {
        return carName;
    }

    private void validateCarName(String carName) {
        if (carName == null || carName.isEmpty()) {
            throw new IllegalArgumentException(NAME_ERROR_MESSAGE);
        }
    }
}
