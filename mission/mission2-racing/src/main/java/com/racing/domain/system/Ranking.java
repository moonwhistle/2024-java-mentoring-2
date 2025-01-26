package com.racing.domain.system;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Ranking {

    private static final String JOINING_SYMBOL = ",";

    public String joinWinner(List<String> winner) {
        return String.join(JOINING_SYMBOL, winner);
    }

    public LinkedHashMap<String, String> getLastLap(List<LinkedHashMap<String, String>> racingRecord) {
        return racingRecord.get(racingRecord.size() - 1);
    }

    public List<String> findNameOfWinner(LinkedHashMap<String, String> lastLap) {
        int maxPosition = findMaxPosition(lastLap);
        return lastLap.entrySet()
                .stream()
                .filter(v->v.getValue().length() == maxPosition)
                .map(Map.Entry::getKey)
                .toList();
    }

    private int findMaxPosition(LinkedHashMap<String, String> positionRecord) {
        return positionRecord.values()
                .stream()
                .mapToInt(v->v.length())
                .max()
                .orElse(0);
    }
}
