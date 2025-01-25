package com.racing.domain.system;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Ranking {

    private static final String JOINING_SYMBOL = ",";

    public List<String> findWinner(List<LinkedHashMap<String, String>> racingRecord) {
        LinkedHashMap<String, String> lastLap = racingRecord.get(racingRecord.size() - 1);
        int maxPosition = findMaxPosition(lastLap);
        return lastLap.entrySet()
                .stream()
                .filter(v->v.getValue().length() == maxPosition)
                .map(Map.Entry::getKey)
                .toList();
    }

    public String joinWinner(List<String> winner) {
        return String.join(JOINING_SYMBOL, winner);
    }

    private int findMaxPosition(LinkedHashMap<String, String> positionRecord) {
        return positionRecord.values()
                .stream()
                .mapToInt(v->v.length())
                .max()
                .orElse(0);
    }
}
