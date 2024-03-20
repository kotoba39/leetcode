import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveDuplicates2Test {
    RemoveDuplicates2 removeDuplicates2 = new RemoveDuplicates2();

    @ParameterizedTest
    @MethodSource("getRemoveDuplicates2List")
    void testForRemoveDuplicates2(int result, int[] nums) {
        assertEquals(result, removeDuplicates2.removeDuplicates2(nums));
    }

    static Stream<Arguments> getRemoveDuplicates2List() {
        return Stream.of(
                Arguments.of(5, new int[]{1,1,1,2,2,3}),
                Arguments.of(7, new int[]{0,0,1,1,1,1,2,3,3}));

    }

}
