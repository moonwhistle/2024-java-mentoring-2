package com.racing.view;

public class OutputView {

    public void showResultComment() {
        System.out.println("\n실행 결과");
    }

    public void showLapRecord(String carName, String carPosition) {
        System.out.println(carName + " : " + carPosition);
    }

    public void showWinner(String winner) {
        System.out.println(winner + "가 최종 우승했습니다.");
    }

    public void makeNewLine() {
        System.out.println();
    }

}
