package Lotto.view;

import Lotto.domain.Lotto;

import java.util.ArrayList;

public class OutputView {

    private final static String lottoPurchase = "개를 구매했습니다.";

    public void printLottoNumber(int lottoNumber){
        System.out.println();
        System.out.println(lottoNumber + lottoPurchase);
    }

    public void printLottoList(Lotto lotto){
        ArrayList<ArrayList<Integer>> lottoList = lotto.getLottoList();

        for(int i = 0; i < lottoList.size(); i++){
            System.out.println(lottoList.get(i).toString());
        }
    }

}
