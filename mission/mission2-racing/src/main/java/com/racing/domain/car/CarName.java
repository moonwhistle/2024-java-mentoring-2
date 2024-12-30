package com.racing.domain.car;

import com.racing.common.exception.EmptyNameValueException;

public class CarName {

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
            throw new EmptyNameValueException();
        }
    }
}
