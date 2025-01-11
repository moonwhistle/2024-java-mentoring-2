import com.lotto.common.DefaultLottoConfig;
import com.lotto.common.DefaultLottoNumberGenerator;
import com.lotto.common.LottoConfig;

import com.lotto.common.LottoNumberGenerator;
import com.lotto.domain.LottoLogic;
import com.lotto.domain.IntegerParser;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestLotto {

    @Test
    public void notIntegerErrorTest() {

        //given
        LottoConfig lottoConfig = new DefaultLottoConfig();

        String strNumber = "1.5";
        String expectedErrorMessage = "입력된 값이 정수가 아닙니다.";

        //when
        IntegerParser integerParser = new IntegerParser(lottoConfig);

        //then
        RuntimeException thrown = Assertions.assertThrows(RuntimeException.class,
                () -> integerParser.parseInteger(strNumber)
        );

        assertEquals(expectedErrorMessage, thrown.getMessage());
    }

    @Test
    public void minPriceTest() {

        //given
        LottoConfig lottoConfig = new DefaultLottoConfig();

        String strNumber = "500";
        String expectedErrorMessage = "로또를 구매하기 위한 최소 금액은 1000원입니다.";

        //when
        IntegerParser integerParser = new IntegerParser(lottoConfig);

        //then
        RuntimeException thrown = Assertions.assertThrows(RuntimeException.class,
                () -> integerParser.parseInteger(strNumber)
        );

        assertEquals(expectedErrorMessage, thrown.getMessage());
    }

    @Test
    public void minusTest() {

        //given
        LottoConfig lottoConfig = new DefaultLottoConfig();

        String strNumber = "-10";
        String expectedErrorMessage = "로또를 구매하기 위한 최소 금액은 1000원입니다.";

        //when
        IntegerParser integerParser = new IntegerParser(lottoConfig);

        //then
        RuntimeException thrown = Assertions.assertThrows(RuntimeException.class,
                () -> integerParser.parseInteger(strNumber)
        );

        assertEquals(expectedErrorMessage, thrown.getMessage());
    }

    @Test
    public void parseIntTest() {

        //given
        LottoConfig lottoConfig = new DefaultLottoConfig();

        String strNumber = "14500";
        int expected = 14500;

        //when
        IntegerParser integerParser = new IntegerParser(lottoConfig);

        int result = integerParser.parseInteger(strNumber);

        //then
        assertEquals(expected, result);
    }

    @Test
    public void parseStringNaNTest() {

        //given
        LottoConfig lottoConfig = new DefaultLottoConfig();

        String strNumber = "ㅋㅋㅋㅋㅋㅋㅋㅋ";
        String expectedErrorMessage = "입력된 값이 숫자가 아닙니다.";

        //when
        IntegerParser integerParser = new IntegerParser(lottoConfig);

        //then
        RuntimeException thrown = Assertions.assertThrows(RuntimeException.class,
                () -> integerParser.parseInteger(strNumber)
        );

        assertEquals(expectedErrorMessage, thrown.getMessage());
    }

    @Test
    public void availableAmountTest() {

        //given
        LottoConfig lottoConfig = new DefaultLottoConfig();
        LottoNumberGenerator lottoNumberGenerator = new DefaultLottoNumberGenerator(lottoConfig);

        String amount = "14500";
        int expected = 14;

        //when
        LottoLogic lottoLogic = new LottoLogic(lottoConfig, lottoNumberGenerator);
        int result = lottoLogic.getAvailableAmount(amount);

        //then
        assertEquals(expected, result);
    }
}
