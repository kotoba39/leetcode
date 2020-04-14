class Solution:
    def generateParenthesis(self, n: int):
        def generate(A,left,right):
            if len(A) == 2*n:
                if valid(A):
                    ans.append("".join(A))
            else:
                if right>left:
                    A.append('(')
                generate(A)
                A.pop()
                if left
                A.append(')')
                generate(A)
                A.pop()

        def valid(A):
            bal = 0
            for c in A:
                if c == '(': bal += 1
                else: bal -= 1
                if bal < 0: return False
            return bal == 0

        ans = []
        generate([],0,0)
        return ans

if __name__ == '__main__':
    s=Solution()
    print(s.generateParenthesis(3))