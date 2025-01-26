package Lotto.domain;

public enum WinningResult {

    FOURTH_PRICE(3, "fourthPirce", "3개 일치 (5000원)", 0 , 5000),
    THIRD_PRICE(4, "thirdPrice", "4개 일치 (50000원)", 0, 50000),
    SECOND_PRICE(5, "secondPrice", "5개 일치 (1500000원)", 0, 1500000),
    FIRST_PRICE(6, "firstPrice", "6개 일치 (2000000000원)", 0, 2000000000);

    private int matchCount;
    private String prizeName;
    private String prizeMessage;
    private int prizeCount;
    private int price;

    WinningResult(int matchCount, String prizeName, String prizeMessage, int prizeCount, int price){
        this.matchCount = matchCount;
        this.prizeName = prizeName;
        this.prizeMessage = prizeMessage;
        this.prizeCount =  prizeCount;
        this.price = price;
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

    public int getPrice(){
        return price;
    }

    public void incrementPrizeCount() {
        this.prizeCount++;
    }

    public void matchAndIncrement(Long matchCount){
        if(this.getMatchCount() == matchCount){
            this.incrementPrizeCount();
        }
    }

}
