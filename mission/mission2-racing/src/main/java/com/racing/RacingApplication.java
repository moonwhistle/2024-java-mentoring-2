package com.racing;

import com.racing.controller.RacingController;

import com.racing.domain.number.ZeroToNineNumberGenerator;

import com.racing.service.RacingService;

import com.racing.view.InputView;
import com.racing.view.OutputView;

public class RacingApplication {

    public static void main(String[] args) {
        RacingController racingController = new RacingController(new RacingService(), new ZeroToNineNumberGenerator(), new InputView(), new OutputView());
        racingController.startRacing();
    }
}

