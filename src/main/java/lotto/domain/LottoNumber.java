package lotto.domain;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public record LottoNumber(
    int number
) {

    public static final int MIN_LOTTO_NUMBER = 1;
    public static final int MAX_LOTTO_NUMBER = 45;

    public LottoNumber {
        assert number >= 1 && number <= 45;
    }

    public static List<LottoNumber> allLottoNumbers() {
        return IntStream.rangeClosed(MIN_LOTTO_NUMBER, MAX_LOTTO_NUMBER).mapToObj(LottoNumber::new).collect(
            Collectors.toList());
    }

    @Override
    public String toString() {
        return String.valueOf(number);
    }
}
