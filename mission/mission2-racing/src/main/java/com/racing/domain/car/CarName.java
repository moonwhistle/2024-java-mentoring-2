package com.racing.domain.car;

import com.racing.domain.exception.EmptyValueException;
import com.racing.domain.exception.ExceedNameLengthException;

public class CarName {

    private static final int CAR_NAME_LENGTH_MAX = 5;

    private final String carName;

    public CarName(final String carName) {
        validateNameIsNotEmpty(carName);
        validateNameLength(carName);
        this.carName = carName;
    }

    public String getName() {
        return carName;
    }

    private void validateNameIsNotEmpty(final String carName) {
        if (carName == null || carName.isEmpty()) {
            throw new EmptyValueException();
        }
    }

    private void validateNameLength(final String carName) {
        if (carName.length() > CAR_NAME_LENGTH_MAX) {
            throw new ExceedNameLengthException();
        }
    }
}
