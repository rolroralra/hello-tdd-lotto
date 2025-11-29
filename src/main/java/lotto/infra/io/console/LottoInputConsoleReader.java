package lotto.infra.io.console;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import lotto.domain.LottoAnswerTicket;
import lotto.infra.io.LottoInputReader;

public class LottoInputConsoleReader implements LottoInputReader {

    @Override
    public Integer readLottoCost() {
        return new Scanner(System.in).nextInt();
    }

    @Override
    public LottoAnswerTicket readLottoAnswer() {
        List<Integer> answers = Arrays.stream(new Scanner(System.in).nextLine().split(","))
            .map(Integer::valueOf).toList();

        return new LottoAnswerTicket(answers);
    }
}
