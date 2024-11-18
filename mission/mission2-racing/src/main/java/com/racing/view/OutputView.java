package com.racing.view;

import com.racing.domain.Cars;
import com.racing.domain.Name;
import com.racing.domain.Position;

import java.util.List;

public class OutputView {
    private final int startIndex = 0;
    private final String joinChar = ",";

    public void printDefault(){
        System.out.println();
        System.out.println("실행 결과");
    }

    public void printWinner(List<String> winner){
        System.out.println("최종 우승자 : " + getWinner(winner) + "가 최종 우승했습니다.");
    }

    public String getWinner(List<String> winner){
        return String.join(joinChar, winner);
    }

    public void carsDetail(Cars cars){
        StringBuilder carDetail = new StringBuilder();
        for(int i = startIndex; i < cars.getCarsSize(); i++){
            Name carName = cars.getCarsName().get(i);
            Position carPosition = cars.getCarsPosition().get(i);
            carDetail.append(carName.getName() + " : ");
            String position = signOfCarPosition(carPosition.getPosition());
            carDetail.append(position);
            carDetail.append("\n");
        }
        carDetail.append("\n");

        System.out.println(carDetail.toString());
    }

    private String signOfCarPosition(int position){
        StringBuilder sb = new StringBuilder();
        for(int i = startIndex ; i < position; i++){
            sb.append("-");
        }
        return sb.toString();
    }


}
