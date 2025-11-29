package lotto.view.console;

import lotto.domain.Lotto;
import lotto.view.LottoView;

public class LottoConsoleView implements LottoView {

    @Override
    public void printLottoView(Lotto lotto) {
        System.out.println("%d개를 구매했습니다.".formatted(lotto.tickets.size()));

        lotto.tickets.forEach(System.out::println);
        System.out.println();
    }
}
