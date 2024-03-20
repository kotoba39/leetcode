public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        int index=0;
        int replaceIndex=0;
        while(index<nums.length){
            if(nums[index]!=val){
                nums[replaceIndex]=nums[index];
                replaceIndex++;
            }
            index++;
        }
        return replaceIndex;
    }

}