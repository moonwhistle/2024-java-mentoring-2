package com.racing.dto;

import com.racing.domain.car.Car;

import java.util.List;

public record RacingRequest(List<Car> namesOfCars, int numbersOfLaps) {
}
