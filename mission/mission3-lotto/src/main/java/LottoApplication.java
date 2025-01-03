import Lotto.controller.LottoController;
import Lotto.domain.RandomLottoNumber;
import Lotto.service.LottoService;
import Lotto.view.InputView;
import Lotto.view.OutputView;
import randomNumber.RandomNumberGenerator;

public class LottoApplication {

    public static void main(String[] args){
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();
        RandomLottoNumber randomLottoNumber = new RandomLottoNumber();
        LottoService lottoService = new LottoService();

        LottoController lottoController = new LottoController(inputView, outputView, randomLottoNumber, lottoService);
        lottoController.startLotto();
    }

}
