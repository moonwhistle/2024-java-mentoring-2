package com.racing.dto;

import java.util.LinkedHashMap;
import java.util.List;

public record RacingResponse(String winner, List<LinkedHashMap<String, String>> racingProgress) {
}
