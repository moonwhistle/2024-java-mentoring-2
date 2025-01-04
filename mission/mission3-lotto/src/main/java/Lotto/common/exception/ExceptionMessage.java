package Lotto.common.exception;

public enum ExceptionMessage {

    DUPLICATE_NUMBER("duplicateNumber", "로또 숫자에 중복이 있습니다."),
    INVALID_LOTTO_NUMBER("invalidLottoNumber", "로또 구매 금액은 최소 1000원 입니다."),
    NUMBER_OUT_OF_RANGE("numberOutOfRange", "로또 숫자 범위를 벗어나는 숫자가 있습니다.");

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
