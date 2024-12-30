package view;

public class OutputView {

    private final static String lottoPurchase = "개를 구매했습니다.";

    public void printLottoNumber(int lottoNumber){
        System.out.println(lottoNumber + lottoPurchase);
    }

}
