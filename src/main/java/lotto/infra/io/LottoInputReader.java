package lotto.infra.io;

import lotto.domain.LottoAnswerTicket;

public interface LottoInputReader {
    Integer readLottoCost();
    LottoAnswerTicket readLottoAnswer();
}
