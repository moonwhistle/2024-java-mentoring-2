package com.racing.domain.car;

public class CarName {

    private static final String NAME_ERROR_MESSAGE = "차 이름을 다시 입력하세요.";

    private final String carName;

    public CarName(final String carName) {
        validateCarName(carName);
        this.carName = carName;
    }

    public String getCarName() {
        return carName;
    }

    private void validateCarName(String carName) {
        if (carName == null) {
            throw new IllegalArgumentException(NAME_ERROR_MESSAGE);
        }
    }
}
