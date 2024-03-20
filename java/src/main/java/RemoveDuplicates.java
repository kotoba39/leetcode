public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int uniqueIndex=0;
        int compareIndex=1;
        while(compareIndex<nums.length){
            if(nums[uniqueIndex]!=nums[compareIndex]){
                nums[++uniqueIndex]=nums[compareIndex];
            }
            compareIndex++;

        }
        return uniqueIndex+1;
    }
}
