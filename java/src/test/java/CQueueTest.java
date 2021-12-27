import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.*;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class CQueueTest {
    CQueue cQueue=new CQueue();
    @ParameterizedTest
    @MethodSource("deleteHead")
    void appendTail(int result,CQueue cQueue, int target) {
        assertArrayEquals(result, cQueue.deleteHead(target));
    }

    static Stream<Arguments> getDeleteHeadList() {
        return Stream.of(Arguments.of(new int[]{-1}, new int[]{2, 7, 11, 15}, 9),
                Arguments.of(new int[]{1, 2},new int[]{3, 2, 4}, 6),
                Arguments.of(new int[]{0, 1}, new int[]{3, 3}, 6));

    }
}
