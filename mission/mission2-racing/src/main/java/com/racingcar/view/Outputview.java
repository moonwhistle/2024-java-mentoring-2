package com.racingcar.view;

public class Outputview {

    public void showCarNameInputPrompt(){
        System.out.println("경주할 자동차 이름을 입력하세요.");
    }

    public void showTryCountInputPrompt(){
        System.out.println("시도할 횟수는 몇회인가요?");
    }

    public void showCarMove(String carName, int carMove){
        System.out.println(carName + " : " + carMove);
    }
}
