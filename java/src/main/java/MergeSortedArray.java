public class MergeSortedArray {
    public void  mergeSortedArray(int[] nums1, int m, int[] nums2, int n) {
        int num1_index=m-1;
        int num2_index=n-1;
        for(int i=m+n-1;i>=0;i--) {
            if (num1_index < 0) {
                nums1[i] = nums2[num2_index--];
            } else if (num2_index < 0) {
                return;
            } else if (nums1[num1_index] >= nums2[num2_index]) {
                nums1[i] = nums1[num1_index--];
            } else {
                nums1[i] = nums2[num2_index--];
            }
        }

    }
}
