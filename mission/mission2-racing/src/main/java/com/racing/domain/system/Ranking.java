package com.racing.domain.system;

import java.util.LinkedHashMap;

public class Ranking {

    private static final String JOINING_SYMBOL = ",";

    private int findMaxPosition(LinkedHashMap<String, String> positionRecord) {
        return positionRecord.values()
                .stream()
                .mapToInt(v->v.length())
                .max()
                .orElse(0);
    }
}
