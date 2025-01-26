package Lotto.common.displayText;

public enum DisplayText {

    ENTER_PURCHASE_AMOUNT("enterPurchaseAmount", "구입금액을 입력해 주세요."),
    PURCHASE_NUMBER("purchaseNumber", "개를 구매했습니다."),
    ENTER_WINNING_NUMBER("enterWinningNumber", "지난 주 당첨 번호를 입력해 주세요."),
    WINNING_RESULT("winningResult", "당첨 통계"),
    WINNING_RESULT_BAR("winningResultBar", "---------"),
    TOTAL_PROFIT("totalProfit", "총 수익률은"),
    ANNOUNCEMENT("announcement", "입니다."),
    PRIZE_MESSAGE_SEPARATOR("prizeMessageSeparator", "-"),
    NEW_LINE("newLine", "\n");

    private String inputName;
    private String inputMessage;

    DisplayText(String inputName, String inputMessage){
        this.inputName = inputName;
        this.inputMessage = inputMessage;
    }

    public String getInputMessage(){
        return inputMessage;
    }

    public String getInputName(){
        return inputName;
    }

}
