import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReplaceSpaceTest {
    ReplaceSpace replaceSpace=new ReplaceSpace();
    @ParameterizedTest
    @MethodSource("replaceSpace")
    void test(String result,String s) {
        assertEquals(result, replaceSpace.replaceSpace(s));
    }

    static Stream<Arguments> replaceSpace() {
        return Stream.of(Arguments.of("We%20are%20happy.","We are happy."),Arguments.of("We%20%20%20are%20happy.","We   are happy."));

    }
}
