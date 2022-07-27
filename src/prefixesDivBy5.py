class Solution:
    def prefixesDivBy5(self, A: List[int]) -> List[bool]:
        resultList=[]
        num=0;
        for index in A:
            num+=num*2+index
            if num%5:
              resultList.append(False)
            else:
                resultList.append(True)
        return resultList
