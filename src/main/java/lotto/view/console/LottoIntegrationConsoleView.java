package lotto.view.console;

import lombok.experimental.Delegate;
import lotto.view.LottoAnswerInputView;
import lotto.view.LottoCostInputView;
import lotto.view.LottoResultView;
import lotto.view.LottoView;

public class LottoIntegrationConsoleView implements LottoView, LottoAnswerInputView, LottoCostInputView,
    LottoResultView {

    @Delegate
    private final LottoView lottoView = new LottoConsoleView();

    @Delegate
    private final LottoAnswerInputView lottoAnswerInputView = new LottoAnswerInputConsoleView();

    @Delegate
    private final LottoCostInputView lottoCostInputView = new LottoCostInputConsoleView();

    @Delegate
    private final LottoResultView lottoResultView = new LottoResultConsoleView();
}
