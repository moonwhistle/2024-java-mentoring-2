package Lotto.domain;

import Lotto.common.exception.ExceptionMessage;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Lottos {

    private static final int invalidLottoNumber = 0;

    private List<Lotto> lottos;
    private int numberOfLottos;

    public Lottos(List<Lotto> lottos, int numberOfLottos){
        this.lottos = lottos;
        validLottoNumber(numberOfLottos);
        this.numberOfLottos = numberOfLottos;
    }

    public List<Lotto> getLottos(){
        return new ArrayList<>(lottos);
    }

    public int getNumberOfLottos(){
        return numberOfLottos;
    }

    public void validLottoNumber(int numberOfLottos){
        if(numberOfLottos <= invalidLottoNumber)
            throw new IllegalArgumentException(ExceptionMessage.INVALID_LOTTO_NUMBER.getMessage());
    }

}
