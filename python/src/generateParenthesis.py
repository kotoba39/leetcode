class Solution:
    def generateParenthesis(self, n: int):
        str=[]
        result=[]
        self.getStr(str,n,result,0,0)
        return  result

    def getStr(self,str,n,result,l,r):
        if len(str)>=2*n:
            if self.check(str,n):
                s=''
                for i in str:
                    s+=i
                result.append(s)
            return
        if l<n:
            str.append('(')
            l+=1
            self.getStr(str, n, result,l,r)
            str.pop()
            l-=1
        if r<l:
            str.append(')')
            r+=1
            self.getStr(str,n,result,l,r)
            str.pop()
            r-=1

    #校验
    def check(self,str,n):
        left=0
        right=0
        for c in str:
            if '('==c:
                left+=1
            else:
                right+=1
            if right>left or left>n or right>n:
                return False
        return True
if __name__ == "__main__":
    # execute only if run as a script
    s=Solution()
    print(s.generateParenthesis(3))

