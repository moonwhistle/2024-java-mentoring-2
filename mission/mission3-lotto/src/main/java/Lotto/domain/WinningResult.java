package Lotto.domain;

public enum WinningResult {

    FOURTH_PRICE(3, "fourthPirce", "3개 일치 (5000원)", 0 , 5000, 0),
    THIRD_PRICE(4, "thirdPrice", "4개 일치 (50000원)", 0, 50000, 0),
    SECOND_PRICE(5, "secondPrice", "5개 일치 (1500000원)", 0, 1500000, 0),
    SECOND_BONUS_PRICE(6, "secondBonusPrice", "5개 일치, 보너스 볼 일치(30000000원)", 0, 30000000, 0),
    FIRST_PRICE(6, "firstPrice", "6개 일치 (2000000000원)", 0, 2000000000, 1);

    private int matchCount;
    private String prizeName;
    private String prizeMessage;
    private int prizeCount;
    private int price;
    private int bonus;

    WinningResult(int matchCount, String prizeName, String prizeMessage, int prizeCount, int price, int bonus){
        this.matchCount = matchCount;
        this.prizeName = prizeName;
        this.prizeMessage = prizeMessage;
        this.prizeCount =  prizeCount;
        this.price = price;
        this.bonus = bonus;
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

    public int getBonus(){return bonus;}

    public void incrementBonus(){
        this.bonus++;
    }

    public void matchAndIncrement(Long matchCount){
        if(this.getMatchCount() == matchCount){
            this.incrementPrizeCount();
        }
    }

}
