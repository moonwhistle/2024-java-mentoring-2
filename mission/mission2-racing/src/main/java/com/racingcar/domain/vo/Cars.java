package com.racingcar.domain.vo;

import com.racingcar.domain.CarsLogic;
import com.racingcar.domain.RandomNumberGenerator;
import com.racingcar.domain.ZeroToNineGenerator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;

public class Cars {
    private final Integer MOVE_BOUND_NUMBER = 4;
    private final Integer MOVE_STATE = 1;
    private final Integer STOP_STATE = 0;
    private final String MOVEMENT_CHAR = "-";

    private final List<Car> cars;
    private final RandomNumberGenerator zeroToNineGenerator;
    private final ArrayList<HashMap<String, String>> carsMovementRecord;
    private final CarsLogic carsLogic;

    public Cars(final ArrayList<String> carsArray) {
        this.cars = makeCars(carsArray);
        this.zeroToNineGenerator = new ZeroToNineGenerator();
        this.carsMovementRecord = new ArrayList<>();
        this.carsLogic = new CarsLogic();
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
        List<Car> cars = new ArrayList<>();

        for (String name : carsArray) {
            Car car = new Car(name);
            cars.add(car);
        }

        return cars;
    }

    private void recordCarMovement() {
        HashMap<String, String> map = new HashMap<>();

        for (final Car car : cars) {
            map.put(car.getName(), getVisualizedMovement(car));
        }

        this.carsMovementRecord.add(map);
    }

    private String getVisualizedMovement(Car car){
        int position = car.getPosition();

        return buildVisualizedCarMovement(position);
    }

    private String buildVisualizedCarMovement(int position) {
        return MOVEMENT_CHAR.repeat(Math.max(0, position));
    }

    private int getCarMoveState(int randomNumber) {
        if (randomNumber >= MOVE_BOUND_NUMBER) {
            return MOVE_STATE;
        }

        return STOP_STATE;
    }
}
