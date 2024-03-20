import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContainsNearbyDuplicateTest {
    ContainsNearbyDuplicate containsNearbyDuplicate = new ContainsNearbyDuplicate();

    @ParameterizedTest
    @MethodSource("getContainsNearbyDuplicateList")
    void testForContainsNearbyDuplicate(boolean result, int[] nums, int k) {
        assertEquals(result, containsNearbyDuplicate.containsNearbyDuplicate(nums, k));
    }

    static Stream<Arguments> getContainsNearbyDuplicateList() {
        return Stream.of(
                Arguments.of(true, new int[]{1, 2, 3, 1}, 3),
                Arguments.of(true, new int[]{1, 0, 1, 1}, 1),
                Arguments.of(false, new int[]{1, 2, 3, 1, 2, 3}, 2),
                Arguments.of(true, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 9}, 3)
        );

    }

}
