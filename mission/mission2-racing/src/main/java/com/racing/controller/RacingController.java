package com.racing.controller;

import com.racing.domain.Car.Cars;
import com.racing.domain.Racing;
import com.racing.view.InputView;
import com.racing.view.OutputView;

import java.util.List;

public class RacingController {

    private final Cars cars;
    private final Racing racing;
    private final InputView inputView;
    private final OutputView outputView;

    public RacingController(Cars cars, Racing racing, InputView inputView, OutputView outputView) {
        this.cars = cars;
        this.racing = racing;
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void racingCar(){
        String carNames = inputView.inputCarName(); // 차 이름 입력 받기
        System.out.println(carNames);
        String[] carNameArray = cars.carNameSharing(carNames); //','로 차이름 나누기

        cars.addListCarName(carNameArray);
        cars.whichCarMove();

        int maxNumber = racing.maxMoveNumber();
        List<String> carNameList = racing.winnerName(maxNumber);
        String winnerName = racing.listToString(carNameList);

        outputView.output(winnerName,maxNumber);
    }
}
