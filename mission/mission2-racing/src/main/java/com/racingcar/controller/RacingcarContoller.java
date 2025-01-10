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

    private void showResult(ResponseDTO raceResponseDTO) {
        showCarsMovement(raceResponseDTO.carsMovement());
        showWinners(raceResponseDTO.winners());
    }

    private String getCarNamesFromView() {
        outputview.showCarNameInputPrompt();

        return inputView.getInput();
    }

    private String getTryCountFromView() {
        outputview.showTryCountInputPrompt();

        return inputView.getInput();
    }

    private RequestDTO createRequestView() {
        String carNames = getCarNamesFromView();
        String tryCount = getTryCountFromView();

        return new RequestDTO(carNames, tryCount);
    }

    private void showCarsMovement(ArrayList<HashMap<String, String>> carsMovement) {
        for (HashMap<String, String> movement : carsMovement) {
            loopMovementMap(movement);
        }
    }

    private void loopMovementMap(HashMap<String, String> movement) {
        for (String carName : movement.keySet()) {
            outputview.showCarMove(carName, movement.get(carName));
        }

        outputview.showSpace();
    }

    private void showWinners(String winners) {
        outputview.showWinner(winners);
    }
}
