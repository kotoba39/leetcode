import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountBitsTest {
    CountBits countBits = new CountBits();

    @ParameterizedTest
    @MethodSource("getConnBitsList")
    void testForTwoSum(int[] result, int n) {
        assertArrayEquals(result, countBits.countBits(n));
    }

    static Stream<Arguments> getConnBitsList() {
        return Stream.of(
                Arguments.of(new int[]{0,1,1}, 2),
                Arguments.of(new int[]{0,1,1,2,1,2}, 5),
                Arguments.of(new int[]{0,1,1,2,1,2,2,3,1},8));

    }

}
