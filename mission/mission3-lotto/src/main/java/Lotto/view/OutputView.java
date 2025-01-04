package Lotto.view;

import Lotto.common.displayText.DisplayText;

public class OutputView {

    public void printLottoNumber(int lottoNumber){
        System.out.println();
        System.out.println(lottoNumber + DisplayText.PURCHASE_NUMBER.getInputMessage());
    }

    public void printLottoList(String lottoList){
        System.out.println(lottoList);
    }

}
