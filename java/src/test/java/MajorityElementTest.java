import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MajorityElementTest {
    MajorityElement majorityElement = new MajorityElement();

    @ParameterizedTest
    @MethodSource("getMajorityElement")
    void testForMajorityElement(int result,int[] nums) {
        assertEquals(result, majorityElement.majorityElement(nums));
    }

    static Stream<Arguments> getMajorityElement() {
        return Stream.of(
                Arguments.of(3, new int []{3,2,3}),
                Arguments.of(2, new int []{2,2,1,1,1,2,2}));

    }

}
