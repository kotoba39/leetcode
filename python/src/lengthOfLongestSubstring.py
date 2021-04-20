class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        result=0
        str=''
        count=0
        for c in s:
            if c not in str:
                str+=c
                count+=1
            else:
                result=count if count>result else result
                str=str.split(c)[1]+c
                count=len(str)
        return result if result>count else count

if __name__ == '__main__':
    s=Solution()
    print(s.lengthOfLongestSubstring('pwwkew'))

