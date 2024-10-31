package com.racingcar.domain;

public class RacingCarLogic {

    public int getCarMoveState(int randomNumber){
        if(randomNumber >= 4){
            return 1;
        }

        return 0;
    }

    public String isCarMoved(int moveState){
        if(moveState == 1){
            return "move";
        }

        return "stop";
    }
}
