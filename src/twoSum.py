class Solution:
    def twoSum(self,nums,target):
        num_target=[]
        num_index=[]
        result=[]
        for index, num in enumerate(nums):
            num_target.append(num)
            num_index.append(index)
        num_dict=dict(zip(num_target,num_index))
        for index, num in enumerate(nums):
            #print(num_dict.get(target-num)) 去掉同一个数
            if num_dict.get(target-num) and index!=num_dict.get(target-num):
                result.append(index)
                result.append(num_dict.get(target-num))
                break
        return result


nums=[3,3]
target=6
solution=Solution()
print(solution.twoSum(nums,target))

