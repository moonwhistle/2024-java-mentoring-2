package com.racingcar.controller;

import com.racingcar.controller.dto.RequestDTO;
import com.racingcar.controller.dto.ResponseDTO;

import com.racingcar.sevice.RaceService;

import com.racingcar.view.InputView;
import com.racingcar.view.Outputview;

public class RacingcarContoller {
    private final InputView inputView;
    private final Outputview outputview;
    private final RaceService raceService;

    public RacingcarContoller() {
        this.inputView = new InputView();
        this.outputview = new Outputview();
        this.raceService = new RaceService();
    }
    public String getCarNamesFromView() {
        outputview.showCarNameInputPrompt();

        return inputView.getInput();
    }

    public String getTryCountFromView() {
        outputview.showTryCountInputPrompt();

        return inputView.getInput();
    }

    public RequestDTO createRequestView() {
        String carNames = getCarNamesFromView();
        String tryCount = getTryCountFromView();

        return new RequestDTO(carNames, tryCount);
    }

    public void manageRaceFlow() {
        RequestDTO inputViewRequestDTO = createRequestView();
        ResponseDTO raceResponseDTO = raceService.raceCar(inputViewRequestDTO);

        String winners = raceResponseDTO.winners();
        outputview.showWinner(winners);
    }
}
