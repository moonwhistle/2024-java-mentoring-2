package Lotto.exception;

public enum ExceptionMessage {

    DUPLICATE_NUMBER("duplicateNumber", "로또 숫자에 중복이 있습니다."),
    INVALID_PRICE("invalidPrice", "로또 구매 금액은 최소 1000원 입니다.");

    private final String errorName;
    private final String message;

    ExceptionMessage(String errorName, String message){
        this.errorName = errorName;
        this.message = message;
    }

    public String getErrorName() {
        return errorName;
    }

    public String getMessage() {
        return message;
    }

}
