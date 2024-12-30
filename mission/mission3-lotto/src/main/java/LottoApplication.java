import Lotto.controller.LottoController;
import Lotto.domain.RandomLottoNumber;
import Lotto.view.InputView;
import Lotto.view.OutputView;
import randomNumber.RandomNumberGenerator;

public class LottoApplication {

    public static void main(String[] args){
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();
        RandomLottoNumber randomLottoNumber = new RandomLottoNumber();

        LottoController lottoController = new LottoController(inputView, outputView, randomLottoNumber);
        lottoController.startLotto();
    }

}
