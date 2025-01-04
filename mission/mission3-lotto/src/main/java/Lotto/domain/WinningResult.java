package Lotto.domain;

public enum WinningResult {

    FOURTH_PRICE("fourthPirce", "3개 일치 (5000원)", 0),
    THIRD_PRICE("thirdPrice", "4개 일치 (50000원)", 0),
    SECOND_PRICE("secondPrice", "5개 일치 (1500000원)", 0),
    FIRST_PRICE("firstPrice", "6개 일치 (2000000000원)", 0);

    private String prizeName;
    private String prizeMessage;
    private int prizeCount;

    WinningResult(String prizeName, String prizeMessage, int prizeCount){
        this.prizeName = prizeName;
        this.prizeMessage = prizeMessage;
        this.prizeCount =  prizeCount;
    }

    public String getPrizeName(){
        return prizeName;
    }

    public String getPrizeMessage(){
        return prizeMessage;
    }

    public int getPrizeCount(){
        return prizeCount;
    }

}
