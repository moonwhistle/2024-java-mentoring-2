package Lotto.domain;

public enum WinningResult {

    FOURTH_PRICE(3, "fourthPirce", "3개 일치 (5000원)", 0),
    THIRD_PRICE(4, "thirdPrice", "4개 일치 (50000원)", 0),
    SECOND_PRICE(5, "secondPrice", "5개 일치 (1500000원)", 0),
    FIRST_PRICE(6, "firstPrice", "6개 일치 (2000000000원)", 0);

    private int matchCount;
    private String prizeName;
    private String prizeMessage;
    private int prizeCount;

    WinningResult(int matchCount, String prizeName, String prizeMessage, int prizeCount){
        this.matchCount = matchCount;
        this.prizeName = prizeName;
        this.prizeMessage = prizeMessage;
        this.prizeCount =  prizeCount;
    }

    public int getMatchCount(){
        return matchCount;
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
