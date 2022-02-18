import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddBinaryTest {
    AddBinary addBinary = new AddBinary();

    @ParameterizedTest
    @MethodSource("getDivideList")
    void testForTwoSum(int result, String a, String b) {
        assertEquals(result, divide.divide(a, b));
    }

    static Stream<Arguments> getDivideList() {
        return Stream.of(Arguments.of(7, 15, 2),
                Arguments.of(-2, 7, -3),
                Arguments.of(1, 1, 1),
                Arguments.of(0, 0, 1),
                Arguments.of(2147483647, -2147483648, -1),
                Arguments.of(-2147483648, -2147483648, 1),
                Arguments.of(-1073741824, -2147483648, 2),
                Arguments.of(1, -2147483648, "11"));

    }

}
