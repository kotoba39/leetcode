import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddBinaryTest {
    AddBinary addBinary = new AddBinary();

    @ParameterizedTest
    @MethodSource("getAddBinaryList")
    void testForTwoSum(String result, String a, String b) {
        assertEquals(result, addBinary.addBinary(a, b));
    }

    static Stream<Arguments> getAddBinaryList() {
        return Stream.of(
                Arguments.of("10101", "1011", "1010"),
                Arguments.of("101", "10", "11"));

    }

}
