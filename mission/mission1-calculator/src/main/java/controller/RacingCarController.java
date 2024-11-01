package controller;

import view.InputView;
import view.OutputView;

import domain.RacingCar;
import domain.RandomNumber;
import domain.RandomNumberGenerator;

public class RacingCarController {
    private final InputView inputView;
    private final OutputView outputView;
    private final RacingCar racingCar;
    private final RandomNumberGenerator randomNumberGenerator;

    public RacingCarController(InputView inputView, OutputView outputView, RacingCar racingCar, RandomNumberGenerator randomNumberGenerator) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.racingCar = racingCar;
        this.randomNumberGenerator = randomNumberGenerator;
    }

    public void startController() {

        String name = inputView.carName();
        int random = randomNumberGenerator.getRandomNumber();
        int result = racingCar.moveCar(random);

        outputView.moveResult(result,name);
    }

}

