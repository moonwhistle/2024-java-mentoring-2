package Lotto.view;

import Lotto.domain.Lotto;
import Lotto.domain.Lottos;

import java.util.ArrayList;

public class OutputView {

    private final static String lottoPurchase = "개를 구매했습니다.";

    public void printLottoNumber(int lottoNumber){
        System.out.println();
        System.out.println(lottoNumber + lottoPurchase);
    }

    public void printLottoList(Lottos lottos){
        lottos.getLottos().forEach(lotto -> {
            System.out.println(lotto.getLotto());
        });
    }

}
