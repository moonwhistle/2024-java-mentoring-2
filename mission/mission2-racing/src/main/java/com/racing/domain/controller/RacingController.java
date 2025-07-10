package com.racing.domain.controller;

import com.racing.domain.domain.Car;
import com.racing.domain.view.InputView;
import com.racing.domain.view.OutputView;

public class RacingController {

    private final Car car;
    private final InputView inputView;
    private final OutputView outputView;

    public RacingController(Car car, InputView inputView, OutputView outputView) {

        this.car = car;
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void Racing(){
        String carName = inputView.inputCarName();
        int randomValue = car.RandomNumber();
        int count = car.checkRandomValue(randomValue);
        outputView.output(carName,count,randomValue);
    }
}
