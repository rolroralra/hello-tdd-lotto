package lotto.view.console;

import java.util.Map;
import lotto.domain.LottoBenefit;
import lotto.domain.LottoResult;
import lotto.view.LottoResultView;

public class LottoResultConsoleView implements LottoResultView {

    @Override
    public void printLottoResultView(LottoResult lottoResult) {
        System.out.println("\n당첨 통계");
        System.out.println("---------");

        printLottoResultMatchCountMap(lottoResult.lottoResultMatchCountMap);
        printLottoBenefit(lottoResult.lottoBenefit);
    }

    private void printLottoResultMatchCountMap(Map<Integer, Integer> lottoResultMatchCountMap) {
        for (int matchCount = 1; matchCount <= 6; matchCount++) {
            System.out.printf("%d개 일치 - %3d 개%n", matchCount, lottoResultMatchCountMap.getOrDefault(matchCount, 0));
        }

    }

    private void printLottoBenefit(LottoBenefit lottoBenefit) {
        System.out.printf("총 수익률은 %.2f입니다.(기준이 1이기 때문에 결과적으로 손해라는 의미임)%n",
            lottoBenefit.profit());
    }
}
