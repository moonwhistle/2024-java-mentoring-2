package Lotto.common.exception;

public enum ExceptionMessage {

    DUPLICATE_NUMBER("duplicateNumber", "로또 숫자에 중복이 있습니다."),
    INVALID_LOTTO_NUMBER("invalidLottoNumber", "로또 구매 금액은 최소 1000원 입니다."),
    NUMBER_OUT_OF_RANGE("numberOutOfRange", "로또 숫자 범위를 벗어나는 숫자가 있습니다."),
    ZERO_MATCH_COUNT("zeroMatchCount", "당첨 결과가 없습니다."),
    INVALID_WINNING_RESULT("invalidWinningResult", "당첨 숫자는 6개이어야 합니다.(중복 숫자가 있는지 확인하세요)"),
    INVALID_LOTTO_FORMAT("invalidLottoFormat", "로또는 숫자 형태이어야 합니다."),
    EMPTY_OR_NULL_WINNING_NUMBER("emptyOrNullWinningNumber", "당첨 로또 번호가 비어있습니다 (,를 기준으로 6개 숫자를 입력해야 합니다.");

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
