package com.racing.view;

import com.racing.domain.Name;

import java.util.List;

public class OutputView {
    private final int startIndex = 0;
    private final String joinChar = ",";

    public void printDefault(){
        System.out.println();
        System.out.println("실행 결과");
    }

    public void printCarsMove(String carDetailList){
        System.out.println(carDetailList);
    }

    public void printWinner(List<String> winner){
        System.out.println("최종 우승자 : " + getWinner(winner) + "가 최종 우승했습니다.");
    }

    public String getWinner(List<String> winner){
        return String.join(joinChar, winner);
    }

}
