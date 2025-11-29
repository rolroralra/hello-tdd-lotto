package lotto.domain;

import java.util.ArrayList;
import java.util.List;

public class Lotto {
    private static final int LOTTO_TICKET_PRICE = 1000;

    public Lotto(Integer lottoCost) {
        tickets = new ArrayList<>();
        tickets.add(LottoTicket.randomGenerate());
    }

    public final List<LottoTicket> tickets;

    public LottoResult result(LottoAnswerTicket lottoAnswerTicket) {
        return new LottoResult();
    }
}
