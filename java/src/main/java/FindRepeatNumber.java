import java.util.HashMap;
import java.util.Map;

public class FindRepeatNumber {
    public int findRepeatNumber(int[] nums) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int n : nums) {
            if (numMap.get(n) != null) {
                return n;
            }
            numMap.put(n, n);
        }
        return -1;
    }
}
