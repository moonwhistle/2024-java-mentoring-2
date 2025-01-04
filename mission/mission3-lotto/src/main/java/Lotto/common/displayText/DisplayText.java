package Lotto.common.displayText;

public enum DisplayText {

    ENTER_PURCHASE_AMOUNT("enterPurchaseAmount", "구입금액을 입력해 주세요."),
    PURCHASE_NUMBER("purchaseNumber", "개를 구매했습니다.");

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
