import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;


import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RotateTest {
    Rotate rotate = new Rotate();

    @ParameterizedTest
    @MethodSource("getRotateList")
    void testForRotate(int[] result, int[] nums, int k) {
        assertArrayEquals(result, rotate.rotate(nums, k));
    }

    static Stream<Arguments> getRotateList() {
        return Stream.of(
                Arguments.of(new int[]{5,6,7,1,2,3,4},new int[]{1,2,3,4,5,6,7}, 3),
                Arguments.of(new int[]{3,99,-1,-100},new int[]{-1,-100,3,99}, 2));

    }

}
