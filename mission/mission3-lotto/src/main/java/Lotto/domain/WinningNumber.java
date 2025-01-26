package Lotto.domain;

import Lotto.common.exception.ExceptionMessage;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WinningNumber {

    private static final String splitBy = ",";
    private static final int validNumberOfLotto = 6;
    private List<LottoNumber> winningNumber;

    public WinningNumber(String winningNumber){
        isNullWinningNumber(winningNumber);
        isEmptyWinningNumber(winningNumber);
        List<Integer> winning = parseToIntegerNumbers(winningNumber);

        validateNumberOfLotto(winning);

        parseToLottoNumber(winning);
    }

    public List<LottoNumber> getWinningNumber(){
        return winningNumber;
    }

    private LottoNumber toLottoNumber(int number){
        return new LottoNumber(number);
    }

    private void parseToLottoNumber(List<Integer> winning){
        this.winningNumber = winning.stream()
                .map(this::toLottoNumber)
                .collect(Collectors.toList());
    }

    private void validateNumberOfLotto(List<Integer> winning){
        if(winning.size() != validNumberOfLotto)
            throw new IllegalArgumentException(ExceptionMessage.INVALID_WINNING_RESULT.getMessage());
    }

    private Integer parseToInteger(String winning){
        try{
            return Integer.parseInt(winning);
        }
        catch(NumberFormatException numberFormatException){
            throw new IllegalArgumentException(ExceptionMessage.INVALID_LOTTO_FORMAT.getMessage());
        }
    }

    private void isNullWinningNumber(String winningNumber){
        if(winningNumber == null){
            throw new IllegalArgumentException(ExceptionMessage.EMPTY_OR_NULL_WINNING_NUMBER.getMessage());
        }
    }

    private void isEmptyWinningNumber(String winningNumber){
        if(winningNumber.trim().isEmpty()){
            throw new IllegalArgumentException(ExceptionMessage.EMPTY_OR_NULL_WINNING_NUMBER.getMessage());
        }
    }

    private String removeSpace(String winningNumbers){
        return winningNumbers.trim();
    }

    private List<String> parseInputWinningNumbers(String winningNumbers){
        return Arrays.stream(removeSpace(winningNumbers).split(splitBy))
                .toList();
    }

    private List<Integer> parseToIntegerNumbers(String winningNumbers){
        List<String> stringNumbers = parseInputWinningNumbers(winningNumbers);

        return stringNumbers.stream()
                .map(this::parseToInteger)
                .distinct()
                .collect(Collectors.toList());
    }

}
