import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveElementTest {
    RemoveElement removeElement = new RemoveElement();

    @ParameterizedTest
    @MethodSource("getRemoveElementList")
    void testForRemoveElement(int result, int[] nums, int val) {
        assertEquals(result, removeElement.removeElement(nums, val));
    }

    static Stream<Arguments> getRemoveElementList() {
        return Stream.of(
                Arguments.of(2, new int[]{3,2,2,3}, 3),
                Arguments.of(5, new int[]{0,1,2,2,3,0,4,2}, 2)
        );

    }

}
