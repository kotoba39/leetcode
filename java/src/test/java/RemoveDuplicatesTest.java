import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveDuplicatesTest {
    RemoveDuplicates removeDuplicates = new RemoveDuplicates();

    @ParameterizedTest
    @MethodSource("getRemoveDuplicatesList")
    void testForRemoveDuplicates(int result, int[] nums) {
        assertEquals(result, removeDuplicates.removeDuplicates(nums));
    }

    static Stream<Arguments> getRemoveDuplicatesList() {
        return Stream.of(
                Arguments.of(2, new int[]{1,1,2}),
                Arguments.of(5, new int[]{0,0,1,1,1,2,2,3,3,4}));

    }

}
