import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MergeSortedArrayTest {
    MergeSortedArray  mergeSortedArray = new MergeSortedArray();

    @ParameterizedTest
    @MethodSource("getMergeSortedArray")
    void mergeSortedArray(int[] result,int[] nums1, int m, int[] nums2, int n) {
        mergeSortedArray.mergeSortedArray(nums1,m,nums2,n);
        assertArrayEquals(result, nums1);
    }

    static Stream<Arguments> getMergeSortedArray() {
        return Stream.of(
                Arguments.of(new int[] {1,2,2,3,5,6},new int[] {1,2,3,0,0,0}, 3, new int[] {2,5,6}, 3),
                Arguments.of(new int[] {1},new int[] {1}, 1, new int[] {}, 0),
                Arguments.of(new int[] {1},new int[] {0}, 0, new int[] {1}, 1));

    }
}
