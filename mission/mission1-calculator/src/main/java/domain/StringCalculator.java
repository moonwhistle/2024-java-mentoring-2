package domain;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class StringCalculator {

    private static final String SLASH = "//";
    private static final String BASIC_SEPARATOR = "[,;]";
    private static final String NEGATIVE_NUMBER_ERROR = "음수를 입력 할 수 없습니다.";

    public String checkError(String userData){
        if (userData.substring(5,6).equals("-"))
            throw new RuntimeException(NEGATIVE_NUMBER_ERROR);

        return userData;
    }

    public String stringClassification(String userData) {
        if (userData.contains(SLASH)) {
            return userData.substring(2, 3);
        }
        return BASIC_SEPARATOR;
    }

    public String reLocationNumber(String userData) {
        if (userData.contains(SLASH)) {
            return userData.substring(5);
        }
        return userData;
    }

    public String[] splitString(String userData, String customSeparator) {
        if(customSeparator.equals( BASIC_SEPARATOR)) {
            return userData.split(BASIC_SEPARATOR);
        }
        return userData.split(customSeparator);
    }

    public List<Integer> changeType(String[] userData) {
        return Arrays.stream(userData)
                .map(Integer::valueOf)
                .collect(Collectors.toList());
    }

    public int sum(List<Integer> processingData) {
        if (processingData.stream().anyMatch(value -> value < 0)) {
            throw new RuntimeException(NEGATIVE_NUMBER_ERROR);
        }

        return processingData.stream().reduce(0, Integer::sum);
    }

}
