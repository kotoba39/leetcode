class Solution:
    def findContinuousSequence(self, target: int) -> List[List[int]]:
        size=(target+1)//2+1
        result=[]
        for i in range(size):

