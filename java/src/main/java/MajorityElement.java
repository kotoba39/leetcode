import java.util.Arrays;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
//        int majorityNum = nums[0];
//        int numCnt = 1;
//        for (int i = 1; i < nums.length; i++) {
//            if (nums[i] == majorityNum) {
//                numCnt++;
//                if (numCnt > nums.length / 2) {
//                    return majorityNum;
//                }
//            } else {
//                majorityNum = nums[i];
//                numCnt = 1;
//            }
//        }
//        return majorityNum;
        return nums[nums.length/2];
    }

}
