package com.racing.domain.car;

public class CarName {

    private final String carName;

    public CarName(final String carName) {
        validateNameValue();
        this.carName = carName;
    }

    private void validateNameValue() {
        if (carName == null || carName.isEmpty()) {
            throw new IllegalArgumentException("자동차 이름을 입력하세요.");
        }
    }
}
