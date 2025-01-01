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

    public RequestDTO wrapInputViewRequest() {
        outputview.showCarNameInputPrompt();
        String strCarNames = inputView.getInput();

        outputview.showTryCountInputPrompt();
        String strTryCount = inputView.getInput();

        return new RequestDTO(strCarNames, strTryCount);
    }

    public void manageRaceFlow() {
        RequestDTO inputViewRequestDTO = wrapInputViewRequest();
        ResponseDTO raceResponseDTO = raceService.raceCar(inputViewRequestDTO);

        String winners = raceResponseDTO.winners();
        outputview.showWinner(winners);
    }
}
