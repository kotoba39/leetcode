class Solution:
    def gcdOfStrings(self, str1: str, str2: str) -> str:
        #先求取两个字符串长度的最大公因子，即共同字符的长度
        size1=len(str1)
        size2=len(str2)
        sub1=size1
        sub2=size2
        #确保size1最大
        if sub1<sub2:
            sub1,sub2=sub2,sub1
        temp=sub1%sub2
        while temp !=0:
            sub1,sub2= sub2,temp
            temp=sub1%sub2
        #最大公因子长度是size2
        #验证str1,2是否符合规律
        strSame=str1[0:sub2]
        #按规律生成str1和2验证是否和原字符串相同
        strSame2=""
        for i in range(int(size1/sub2)):
            if str1[1*sub2:(i+1)*sub2] !=strSame:
                return  ""
        strSame1=""
        for i in range(int(size1/sub2)):
            strSame1+=strSame
        if strSame1!=str1:
            return ""
        return strSame


if __name__ == '__main__':
    s=Solution()
    print(s.gcdOfStrings("TAUXXTAUXXTAUXXTAUXXTAUXX","TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX"))
