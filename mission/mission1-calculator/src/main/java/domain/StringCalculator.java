package domain;

import java.util.List;
import java.util.ArrayList;

public class StringCalculator {

    public static final String SLASH = "//";

    public Integer classification(String insertData) {
        return classificationSymbol(insertData);
    }

    private Integer classificationSymbol(String insertData) {
        if (insertData.contains(SLASH)) {
            return sum(changeType(changeData(reLocation(insertData), findCustom(insertData))));
        }

        if (insertData.substring(1, 2).equals(",||;")) {
        }
        return sum(changeType(basicChangeData(insertData)));

    }

    private String findCustom(String userData) {
        return userData.substring(2, 3);
    }

    private String reLocation(String userData) {
        return userData.substring(5);
    }

    private String[] changeData(String result, String findCustom) {
        return result.split(findCustom);
    }

    private List<Integer> changeType(String[] userData) {

        List<Integer> list = new ArrayList<>();

        for (String i : userData) {
            list.add(Integer.parseInt(i));
        }
        return list;
    }

    private Integer sum(List<Integer> list) {

        int sum = 0;

        for (int i = 0; i < list.size(); i++)
            sum += list.get(i);
        return sum;
    }

    private String[] basicChangeData(String result) {
        return result.split(",|;");
    }

}
