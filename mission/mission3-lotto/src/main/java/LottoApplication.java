import Lotto.controller.LottoController;
import Lotto.domain.*;
import Lotto.view.InputView;
import Lotto.view.OutputView;
import randomNumber.RandomNumberGenerator;

public class LottoApplication {

    public static void main(String[] args){
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();
        RandomLottoNumber randomLottoNumber = new RandomLottoNumber();
        Winning winning = new Winning();
        Profit profit =new Profit();
        LottoGenerator lottoGenerator = new LottoGenerator(randomLottoNumber);

        LottoController lottoController = new LottoController(inputView, outputView, randomLottoNumber, winning, profit, lottoGenerator);
        lottoController.startLotto();
    }

}
