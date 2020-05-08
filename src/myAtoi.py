import re

class Solution:
    def myAtoi(self, str):
        matchResult=re.match('[-+]?\d+', str.strip())
        if matchResult==None:
            return 0
        return min(max(int(matchResult.group()),-2147483648),2147483647)

if __name__ == '__main__':
    s=Solution()
    print(s.myAtoi('   -456789fdghjkl;456'))






