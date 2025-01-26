package Lotto.view;

import Lotto.common.displayText.DisplayText;

public class OutputView {

    public void printLottoNumber(int lottoNumber){
        System.out.println();
        System.out.println(lottoNumber + DisplayText.PURCHASE_NUMBER.getInputMessage());
    }

    public void printLottoList(String lottoList){
        System.out.println(lottoList);
        System.out.println();
    }

    public void printWinningBar(){
        System.out.println();
        System.out.println(DisplayText.WINNING_RESULT.getInputMessage());
        System.out.println(DisplayText.WINNING_RESULT_BAR.getInputMessage());
    }

    public void printWinningResult(String winningResult){
        System.out.println(winningResult);
    }

    public void printProfit(Double profit){
        System.out.println(DisplayText.TOTAL_PROFIT.getInputMessage() + profit + DisplayText.ANNOUNCEMENT.getInputMessage());
    }

}
