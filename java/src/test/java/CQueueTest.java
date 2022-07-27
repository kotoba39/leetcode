import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CQueueTest {
<<<<<<< Updated upstream
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
=======
    CQueue cQueue = new CQueue();

    @ParameterizedTest
    @MethodSource("getDeleteHeadList")
    void appendTail( int result,CQueue cQueue) {
        assertEquals(result,cQueue.deleteHead());
    }

    static Stream<Arguments> getDeleteHeadList() {
        List<CQueue> cQueueList=new ArrayList<>();
        int[] results=new int[cQueueList.size()];

        return Stream.of(Arguments.of(new int[]{-1}, new int[]{2, 7, 11, 15}, 9),
                Arguments.of(new int[]{1, 2}, new int[]{3, 2, 4}, 6),
                Arguments.of(new int[]{0, 1}, new int[]{3, 3}, 6));
>>>>>>> Stashed changes

    }
}
