package com.lotto.view;

import com.lotto.common.LottoResultConfig;

import java.util.Map;

public class OutputView {

    public void showPurchaseAmount() {
        System.out.println("구입금액을 입력해 주세요.");
    }

    public void showPurchaseHistory(int purchaseAmount) {
        System.out.println("\n" + purchaseAmount + "개를 구매했습니다.");
    }

    public void showLotto(String lotto) {
        System.out.println(lotto);
    }

    public void showWinnerNumbersPrompt() {
        System.out.println("\n지난 주 당첨 번호를 입력해 주세요.");
    }

    public void showStatisticsPrompt() {
        System.out.println("\n당첨 통계");
        System.out.println("---------");
    }

    public void showWinStatistics(Map<Integer, Integer> statisticsMap) {
        System.out.println(LottoResultConfig.FIFTH_PLACE.getMessage() + "- " + statisticsMap.getOrDefault(LottoResultConfig.FIFTH_PLACE.getMatchCount(), 0) + "개");
        System.out.println(LottoResultConfig.FOURTH_PLACE.getMessage() + "- " + statisticsMap.getOrDefault(LottoResultConfig.FOURTH_PLACE.getMatchCount(), 0) + "개");
        System.out.println(LottoResultConfig.THIRD_PLACE.getMessage() + "- " + statisticsMap.getOrDefault(LottoResultConfig.THIRD_PLACE.getMatchCount(), 0) + "개");
        System.out.println(LottoResultConfig.FIRST_PLACE.getMessage() + "- " + statisticsMap.getOrDefault(LottoResultConfig.FIRST_PLACE.getMatchCount(), 0) + "개");
    }

    public void showROI(String ROI) {
        System.out.println("총 수익률은 " + ROI + "입니다.");
    }

}
