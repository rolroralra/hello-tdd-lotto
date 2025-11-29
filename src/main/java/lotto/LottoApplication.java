package lotto;

import lotto.domain.Lotto;
import lotto.domain.LottoAnswerTicket;
import lotto.domain.LottoResult;
import lotto.infra.io.LottoInputReader;
import lotto.infra.io.console.LottoInputConsoleReader;
import lotto.view.console.LottoIntegrationConsoleView;

public class LottoApplication {
    private final LottoIntegrationConsoleView lottoIntegrationConsoleView =  new LottoIntegrationConsoleView();
    private final LottoInputReader lottoInputReader = new LottoInputConsoleReader();

    public void run() {
        lottoIntegrationConsoleView.printLottoCostInputView();

        Integer lottoCost = lottoInputReader.readLottoCost();

        Lotto lotto = new Lotto(lottoCost);

        lottoIntegrationConsoleView.printLottoView(lotto);

        lottoIntegrationConsoleView.printLottoAnswerInputView();

        LottoAnswerTicket lottoAnswerTicket = lottoInputReader.readLottoAnswer();

        LottoResult lottoResult = lotto.result(lottoAnswerTicket);

        lottoIntegrationConsoleView.printLottoResultView(lottoResult);
    }
}
