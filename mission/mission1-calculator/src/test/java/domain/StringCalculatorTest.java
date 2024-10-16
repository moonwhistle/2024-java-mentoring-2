package domain;

import java.util.List;
import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StringCalculatorTest {
    @Test
    @DisplayName("기본 구분자 찾기 테스트")
    void 기본_구분자_찾기_테스트() {

        //given
        StringCalculator stringcalculator = new StringCalculator();

        String userData = "1,2,3";
        String expected = "[,;]";

        //when
        String result = stringcalculator.stringClassification(userData);

        //then
        Assertions.assertEquals(expected, result);
    }

    @Test
    @DisplayName("커스텀_구분자 찾기 테스트")
    void 커스텀_구분자_찾기_테스트() {

        //given
        StringCalculator stringcalculator = new StringCalculator();

        String userData = "//;|n1;2;3";
        String expected = ";";

        //when
        String result = stringcalculator.stringClassification(userData);

        //then
        Assertions.assertEquals(expected, result);
    }


    @Test
    @DisplayName("인덱스 재배치 테스트")
    void 인덱스_재배치_테스트() {

        //given
        StringCalculator stringcalculator = new StringCalculator();

        String userData = "//;|n1;2;3;4;5";
        String expected = "1;2;3;4;5";

        //when
        String result = stringcalculator.reLocationNumber(userData);

        //then
        Assertions.assertEquals(expected, result);
    }

    @Test
    @DisplayName("배열 삽입 테스트")
    void 배열_삽입_테스트() {

        //given
        StringCalculator stringcalculator = new StringCalculator();

        String userData = "1;2;3";
        String customSeparator = ";";
        String[] expected = {"1", "2", "3"};

        //when
        String[] result = stringcalculator.splitString(userData,customSeparator);

        //then
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    @DisplayName("리스트 변환 테스트")
    void 리스트_변환_테스트() {

        //given
        StringCalculator stringcalculator = new StringCalculator();

        String[] numberData = {"1", "2", "3"};
        List<Integer> expected = List.of(1, 2, 3);

        //when
        List<Integer> result = stringcalculator.changeType(numberData);

        //then
        Assertions.assertEquals(expected, result);
    }

    @Test
    @DisplayName("리스트 합 테스트")
    void 리스트_합_테스트() {

        //given
        StringCalculator stringcalculator = new StringCalculator();

        List<Integer> processingData = List.of(1, 2, 3);

        int expected = 6;

        //when
        int result = stringcalculator.sum(processingData);

        //then
        Assertions.assertEquals(expected, result);
    }

}

