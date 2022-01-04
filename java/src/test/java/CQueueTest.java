import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.*;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CQueueTest {
    //CQueue cQueue=new CQueue();
    @ParameterizedTest
    @MethodSource("deleteHead")
    void appendTail(int result,CQueue cQueue) {
        assertEquals(result, cQueue.deleteHead());
    }

    static Stream<Arguments> deleteHead() {
        CQueue cQueue=new CQueue();
        cQueue.appendTail(1);

        return Stream.of(Arguments.of(1,cQueue));

    }
}
