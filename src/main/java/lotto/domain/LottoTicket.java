package lotto.domain;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LottoTicket {

    private static final int TOTLA_COUNT_LOTTO_NUMBER_IN_LOTTO_TICKET = 6;

    private final List<LottoNumber> lottoNumbers;

    public LottoTicket(List<LottoNumber> lottoNumbers) {
        this.lottoNumbers = lottoNumbers;
    }

    public static LottoTicket randomGenerate() {
        List<LottoNumber> allLottoNumbers = LottoNumber.allLottoNumbers();
        Collections.shuffle(allLottoNumbers);
        List<LottoNumber> selectedLottoNumbers = allLottoNumbers.stream()
            .limit(TOTLA_COUNT_LOTTO_NUMBER_IN_LOTTO_TICKET).sorted(Comparator.comparing(LottoNumber::number)).toList();
        return new LottoTicket(selectedLottoNumbers);
    }

    @Override
    public String toString() {
        return lottoNumbers.toString();
    }
}
