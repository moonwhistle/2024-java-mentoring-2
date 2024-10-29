package controller;

import view.InputView;
import view.OutputView;

import domain.RacingCar;

public class RacingCarController {
    private final InputView inputView;
    private final OutputView outputView;
    private final RacingCar racingCar;

    public RacingCarController(InputView inputView, OutputView outputView, RacingCar racingCar) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.racingCar = racingCar;
    }

    public void startController() {

        String name = inputView.carName();
        int random = racingCar.randomNumber();
        int result = racingCar.moveCar(random);

        outputView.moveResult(result,name);
    }

}

