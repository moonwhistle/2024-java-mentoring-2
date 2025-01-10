package com.lotto.view;

import java.util.Set;

public class OutputView {
    public void showPurchaseAmount(){
        System.out.println("구입금액을 입력해 주세요.");
    }

    public void showPurchaseHistory(int purchaseAmout){
        System.out.println("\n" +purchaseAmout + "개를 구매했습니다.");
    }

    public void showLotto(Set<Integer> lotto){
        System.out.println(lotto);
    }
}
