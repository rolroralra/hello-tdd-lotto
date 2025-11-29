package lotto.view.console;

import lotto.view.LottoAnswerInputView;

public class LottoAnswerInputConsoleView implements LottoAnswerInputView {

    @Override
    public void printLottoAnswerInputView() {
        System.out.println("지난 주 당첨 번호를 입력해 주세요.");
    }
}
