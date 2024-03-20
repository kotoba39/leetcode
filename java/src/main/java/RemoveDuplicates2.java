public class RemoveDuplicates2 {
    public int removeDuplicates2(int[] nums) {
        int uniqueIndex = 0;
        int compareIndex = 1;
        int equalCnt = 0;
        while (compareIndex < nums.length) {
            if (nums[uniqueIndex] == nums[compareIndex]) {
                equalCnt++;
                if (equalCnt <=1) {
                    nums[++uniqueIndex]=nums[compareIndex];

                }
            } else {
                equalCnt=0;
                nums[++uniqueIndex]=nums[compareIndex];
            }
            compareIndex++;
        }
        return uniqueIndex + 1;
    }
}
