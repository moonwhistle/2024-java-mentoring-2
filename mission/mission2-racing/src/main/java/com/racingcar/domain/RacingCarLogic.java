package com.racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class RacingCarLogic {

    private final String PARSE_ERROR_MESSAGE = "문자열을 숫자로 변경할 수 없습니다.";

    private final int ANCHORED_VALUE = 4;

    private final String STRING_OFFSET1 = " : ";
    private final String STRING_OFFSET2 = "\n";

    public interface RandomNumberGenerator {
        int getRandomNumber();
    }

    public static class ZeroToNineGenerator implements RandomNumberGenerator{
        @Override
        public int getRandomNumber(){
            return (int) (Math.random() * 10);
        }
    }

    public int parseStringTryCount(String tryCount){
        try{
            return Integer.parseInt(tryCount);
        } catch (NumberFormatException e) {
            throw new RuntimeException(PARSE_ERROR_MESSAGE);
        }
    }

    public String processCarMove(int randomValue){
        if(randomValue >= ANCHORED_VALUE) {
            return "-";
        }

        return "";
    }

    public String processMoving(String carName, int tryCount){
        StringBuilder stringValue = new StringBuilder();

        List<String> movedList = getMovedList(tryCount);

        for(String movedLength : movedList){
            appendStringOffset(stringValue, carName, movedLength);
        }

        return stringValue.toString();
    }

    public List<String> getMovedList(int tryCount){
        String movedLength = "";
        List<String> movedList = new ArrayList<>();

        movedList = appendMovedLength(tryCount, movedLength, movedList);

        return movedList;
    }

    public List<String> appendMovedLength(int tryCount, String movedLength, List<String> movedList){

        RandomNumberGenerator randomNumberGenerator = new ZeroToNineGenerator();

        for(int i = 0; i < tryCount; i++){
            int randomValue = randomNumberGenerator.getRandomNumber();
            movedLength += processCarMove(randomValue);
            movedList.add(movedLength);
        }

        return movedList;
    }

    public void appendStringOffset(StringBuilder stringValue, String carName, String movedLength){
        stringValue.append(carName);
        stringValue.append(STRING_OFFSET1);
        stringValue.append(movedLength);
        stringValue.append(STRING_OFFSET2);
    }
}
