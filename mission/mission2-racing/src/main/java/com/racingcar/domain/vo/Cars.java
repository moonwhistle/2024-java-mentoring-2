package com.racingcar.domain.vo;

import com.racingcar.domain.CarsLogic;
import com.racingcar.domain.RandomNumberGenerator;
import com.racingcar.domain.ZeroToNineGenerator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Cars {
    private final Integer MOVE_BOUND_NUMBER = 4;
    private final Integer MOVE_STATE = 1;
    private final Integer STOP_STATE = 0;

    private final List<Car> cars;
    private final RandomNumberGenerator zeroToNineGenerator;
    private final ArrayList<HashMap<String, String>> carsMovementRecord;
    private final CarsLogic carsLogic;

    public Cars(final ArrayList<String> carsArray) {
        this.zeroToNineGenerator = new ZeroToNineGenerator();
        this.carsMovementRecord = new ArrayList<>();
        this.carsLogic = new CarsLogic();
        this.cars = makeCars(carsArray);
    }

    public void moveCars() {
        for (final Car car : cars) {
            int randomNumber = zeroToNineGenerator.getRandomNumber();
            int moveState = getCarMoveState(randomNumber);
            car.move(moveState);
        }

        recordCarMovement();
    }

    public ArrayList<HashMap<String, String>> getCarsMovementRecord() {
        return this.carsMovementRecord;
    }

    public List<String> getWinner() {
        int winnerPosition = carsLogic.getMaxPosition(cars);

        return carsLogic.getWinnerList(cars, winnerPosition);
    }

    private List<Car> makeCars(ArrayList<String> carsArray) {
        return carsLogic.getCarList(carsArray);
    }

    private void recordCarMovement() {
        HashMap<String, String> recordMap = carsLogic.getCarsMovementRecordMap(cars);

        this.carsMovementRecord.add(recordMap);
    }

    private int getCarMoveState(int randomNumber) {
        if (randomNumber >= MOVE_BOUND_NUMBER) {
            return MOVE_STATE;
        }

        return STOP_STATE;
    }
}
