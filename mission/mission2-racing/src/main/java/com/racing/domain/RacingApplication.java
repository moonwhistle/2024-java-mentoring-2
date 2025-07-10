package com.racing.domain;

import com.racing.domain.controller.RacingController;
import com.racing.domain.domain.Car;
import com.racing.domain.domain.vo.RandomValue;
import com.racing.domain.view.InputView;
import com.racing.domain.view.OutputView;

import java.util.Random;
import java.util.Scanner;

public class RacingApplication {
    private final RandomValue randomValue;
    private final Random random;
    private final Scanner scanner;

    public RacingApplication(RandomValue randomValue, Random random, Scanner scanner) {
        this.randomValue = randomValue;
        this.random = random;
        this.scanner = scanner;
    }

    public static void main(String[] args) {
        RacingController racingController = new RacingController(new Car(new RandomValue(new Random())), new InputView(new Scanner(System.in)), new OutputView());
        racingController.Racing();
    }
}
