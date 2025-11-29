package lotto.domain;

import static org.assertj.core.api.Assertions.assertThatNoException;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.stream.IntStream;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

class LottoNumberTest {
    @ParameterizedTest
    @MethodSource("validLottoNumberTestData")
    void lottoNumberTest(Integer validLottoNumber) {
        assertThatNoException().isThrownBy(() -> new LottoNumber(validLottoNumber));
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, 0, 46, 100})
    void invalidLottoNumberTest(Integer invalidLottoNumber) {
        assertThatThrownBy(() -> new LottoNumber(invalidLottoNumber)).isExactlyInstanceOf(AssertionError.class);
    }

    private static Stream<Arguments> validLottoNumberTestData() {
        return IntStream.rangeClosed(LottoNumber.MIN_LOTTO_NUMBER, LottoNumber.MAX_LOTTO_NUMBER)
            .mapToObj(Arguments::of);
    }
}