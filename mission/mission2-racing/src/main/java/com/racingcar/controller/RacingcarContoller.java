package com.racingcar.controller;

import com.racingcar.controller.dto.RequestDTO;
import com.racingcar.controller.dto.ResponseDTO;

import com.racingcar.sevice.RaceService;

import com.racingcar.view.InputView;
import com.racingcar.view.Outputview;

import java.util.ArrayList;
import java.util.HashMap;

public class RacingcarContoller {
    private final InputView inputView;
    private final Outputview outputview;
    private final RaceService raceService;

    public RacingcarContoller() {
        this.inputView = new InputView();
        this.outputview = new Outputview();
        this.raceService = new RaceService();
    }

    public void manageRaceFlow() {
        RequestDTO inputViewRequestDTO = createRequestView();

        ResponseDTO raceResponseDTO = raceService.raceCar(inputViewRequestDTO);

        showResult(raceResponseDTO);
    }

    public void showResult(ResponseDTO raceResponseDTO) {
        showCarsMovement(raceResponseDTO.carsMovement());
        showWinners(raceResponseDTO.winners());
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

    public void showCarsMovement(ArrayList<HashMap<String, String>> carsMovement) {
        for (HashMap<String, String> movement : carsMovement) {
            loopMovementMap(movement);
        }
    }

    public void loopMovementMap(HashMap<String, String> movement) {
        for (String carName : movement.keySet()) {
            outputview.showCarMove(carName, movement.get(carName));
        }

        outputview.showSpace();
    }

    public void showWinners(String winners) {
        outputview.showWinner(winners);
    }
}
