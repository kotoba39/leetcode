public class Search {
    public int search(int[] nums, int target) {
        if (nums == null || nums.length <= 0 || target > nums[nums.length - 1]) {
            return 0;
        }
        boolean isSame = false;
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                result++;
                isSame = true;
            } else {
                if (isSame) {
                    return result;
                }
            }
        }
        return result;
    }
}
