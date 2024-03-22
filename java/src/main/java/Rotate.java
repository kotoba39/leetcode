public class Rotate {

    public int[] rotate(int[] nums, int k) {
        if(k>=nums.length){
           while(k>=nums.length){
               k=k-nums.length;
           }
        }
        int[] rotateArray1=new int[k];
        for(int i=0;i<k;i++){
            rotateArray1[i]=nums[nums.length-k+i];
        }
        int[] rotateArray2=new int[nums.length-k];
        for(int i=0;i<rotateArray2.length;i++){
            rotateArray2[i]=nums[i];

        }
        for(int i=0;i<k;i++){
            nums[i]=rotateArray1[i];
        }
        for(int i=0;i<rotateArray2.length;i++){
            nums[i+k]=rotateArray2[i];
        }
        return nums;
    }
}
