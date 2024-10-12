package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.nio.file.attribute.UserPrincipal;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {
    @Test
    @DisplayName("구분자 찾기 테스트")
    void 구분자_찾기_테스트() {

        //given
        StringCalculator stringcalculator = new StringCalculator();

        String userData ="//;\\n1;2;3";
        String expected = ";";

        //when
        String result = stringcalculator.findCustom(userData);

        //then
        assertEquals(expected, result);
    }


    @Test
    @DisplayName("인덱스 재배치 테스트")
    void 인덱스_재배치_테스트() {

        //given
        StringCalculator stringcalculator = new StringCalculator();

        String userData ="//;\\n1;2;3";
        String expected = "1;2;3";

        //when
        String result = stringcalculator.reLocation(userData);

        //then
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("배열 삽입 테스트")
    void 배열_삽입_테스트() {

        //given
        StringCalculator stringcalculator = new StringCalculator();

        String userData ="1;2;3";
        String [] expected ={"1","2","3"};

        //when
        String[] result = stringcalculator.changeData(userData, ";");

        //then
        assertArrayEquals(expected, result);
    }

    @Test
    @DisplayName("리스트 변환 테스트")
    void 리스트_변환_테스트() {

        //given
        StringCalculator stringcalculator = new StringCalculator();

        String[] numberData ={"1","2","3"};
        List<Integer> expected = Arrays.asList(1, 2, 3);

        //when
        List<Integer> result = stringcalculator.changeType(numberData);

        //then
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("리스트 합 테스트")
    void 리스트_합_테스트() {

        //given
        StringCalculator stringcalculator = new StringCalculator();

        List<Integer> list = Arrays.asList(1,2,3,4,5);

        int expected = 15;

        //when
        int result = stringcalculator.sum(list);

        //then
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("기본 문자 테스트")
    void 기본_문자_테스트() {

        //given
        StringCalculator stringcalculator = new StringCalculator();

        String userData ="1;2;3";
        int expected = 6;

        //when
        int result = stringcalculator.classificationBasicSymbol(userData);

        //then
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("커스텀 문자 합 테스트")
    void 커스텀_문자_합_테스트() {

        //given
        StringCalculator stringcalculator = new StringCalculator();

        String userData ="//;|n1;2;3";
        int expected = 6;

        //when
        int result = stringcalculator.customSymbolSum(userData);

        //then
        assertEquals(expected, result);
    }
}

