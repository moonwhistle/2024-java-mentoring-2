package com.racing.view;

import java.util.LinkedHashMap;
import java.util.List;

public class OutputView {

    public void showResultComment() {
        System.out.println("\n실행 결과");
    }

    public void showRaceProgress(List<LinkedHashMap<String, String>> raceProgress) {
        for(LinkedHashMap<String, String> lapProgress : raceProgress) {
            showLapProgress(lapProgress);
            makeNewLine();
        }
    }

    public void showWinner(String winner) {
        System.out.println(winner + "가 최종 우승했습니다.");
    }

    private void makeNewLine() {
        System.out.println();
    }

    private void showLapProgress(LinkedHashMap<String, String> lapProgress) {
        for(String key : lapProgress.keySet()) {
            System.out.println(key + ": " + lapProgress.get(key));
        }
    }
}
