package com.racing.view;

import java.util.List;

public class OutputView {

    public void showRacingCarsName(List<String> namesOfCars) {
        System.out.println(namesOfCars);
    }

    public void showCarsPosition(List<Integer> positionsOfCars) {
        System.out.println(positionsOfCars);
    }

    public void showWinner(List<String> winner) {
        System.out.println(winner + "우승");
    }

}
