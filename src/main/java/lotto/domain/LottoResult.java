package lotto.domain;

import java.util.HashMap;
import java.util.Map;

public class LottoResult {

    public LottoResult() {
        lottoResultMatchCountMap = new HashMap<>();
        lottoBenefit = new LottoBenefit();
    }

    public final Map<Integer, Integer> lottoResultMatchCountMap;
    public final LottoBenefit lottoBenefit;
}
