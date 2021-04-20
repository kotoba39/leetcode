class Solution:
    '''思路：将数组值和数组各值的index分别作为key和value放入dict，
    遍历dict，用target-数组值，
    若余数能在dict中找到，那么就返回这两个key对应的value，即它们在数组中的index
    '''
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


nums=[3,2,4]
target=6
solution=Solution()
print(solution.twoSum(nums,target))

