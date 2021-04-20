import math
class Solution:
    def findMedianSortedArrays(self, nums1, nums2) :
        nums1Size=len(nums1)
        nums2Size=len(nums2)
        medianMaxIndex=0
        medianMinIndex=0
        if (nums1Size+nums2Size)%2 ==0:
            medianMaxIndex=(nums1Size+nums2Size)//2
            medianMinIndex=medianMaxIndex-1
        else:
            medianMinIndex=(nums1Size+nums2Size)//2
            medianMaxIndex=medianMinIndex
        index1=0
        index2=0
        number=0
        for i in range(medianMaxIndex+1):
            if index1<nums1Size and (index2>=nums2Size or nums1[index1]<nums2[index2]):
                number=nums1[index1]
                index1+=1
            else:
                number = nums2[index2]
                index2+=1
            if i==medianMinIndex:
                medianMin=number
            if i==medianMaxIndex:
                medianMax=number
        return (medianMin+medianMax)/2

if __name__ == '__main__':
    s = Solution()
    print(s.findMedianSortedArrays([1,2],[3,4]))



