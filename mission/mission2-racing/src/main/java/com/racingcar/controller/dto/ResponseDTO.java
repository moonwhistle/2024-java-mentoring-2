package com.racingcar.controller.dto;

import java.util.ArrayList;
import java.util.HashMap;

public record ResponseDTO(String winners, ArrayList<HashMap<String, String>> carsMovement) {
}
