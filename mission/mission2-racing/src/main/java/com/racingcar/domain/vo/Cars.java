package com.racingcar.domain.vo;

import com.racingcar.domain.CarsLogic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Cars {
    private final List<Car> cars;
    private final ArrayList<HashMap<String, String>> carsMovementRecord;
    private final CarsLogic carsLogic;

    public Cars(final ArrayList<String> carsArray) {
        this.carsMovementRecord = new ArrayList<>();
        this.carsLogic = new CarsLogic();
        this.cars = makeCars(carsArray);
    }

    public void moveCars() {
        carsLogic.loopCars(cars);

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
}
