import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class TwoSumTest {

    TwoSum twoSum = new TwoSum();

    @ParameterizedTest
    @MethodSource("getTwoSumList")
    void testForTwoSum(int[] results, int[] nums, int target) {
        assertArrayEquals(results, twoSum.twoSum(nums, target));
    }

    static Stream<Arguments> getTwoSumList() {
        return Stream.of(Arguments.of(new int[]{0, 1}, new int[]{2, 7, 11, 15}, 9),
                Arguments.of(new int[]{1, 2},new int[]{3, 2, 4}, 6),
                Arguments.of(new int[]{0, 1}, new int[]{3, 3}, 6));

    }
}
