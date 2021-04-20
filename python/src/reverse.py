class Solution:
    def reverse(self, x: int) -> int:
        isUnder =True if x<0 else False
        x=abs(x)
        result=0
        while x>=1:
           result= result*10+x%10
           x=int(x/10)
        if result>2147483647:
            return 0
        return -result if isUnder else result

if __name__ == '__main__':
    s=Solution()
    print(s.reverse(1))




