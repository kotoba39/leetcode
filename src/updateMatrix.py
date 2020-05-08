class Solution:

    def updateMatrix(self, matrix):
        y=len(matrix)
        x=len(matrix[0])
        result=[]
        for i in range(y):
            result.append([])
            for j in range(x):
                result[i].append(matrix[i][j])
        while matrix!=None:
            matrix=self.getMatrix(matrix,result,x,y)
        return result



    def getMatrix(self,matrix,result,x,y):
        changeFlag=False
        medianMatrix=[]
        for i in range(y):
            medianMatrix.append([])
            for j in range(x):
                if matrix[i][j] and (i-1<0 or matrix[i-1][j]) and (i+1>=y or matrix[i+1][j]) and (j-1<0 or matrix[i][j-1]) and (j+1>=x or matrix[i][j+1]):
                    result[i][j]+=1
                    medianMatrix[i].append(1)
                    changeFlag=True
                else:
                    medianMatrix[i].append(0)
        if 1-changeFlag:
            return None
        return  medianMatrix

if __name__ == "__main__":
    # execute only if run as a script
    s=Solution()
    print(s.updateMatrix([[1,0,1,1,0,0,1,0,0,1],[0,1,1,0,1,0,1,0,1,1],[0,0,1,0,1,0,0,1,0,0],[1,0,1,0,1,1,1,1,1,1],[0,1,0,1,1,0,0,0,0,1],[0,0,1,0,1,1,1,0,1,0],[0,1,0,1,0,1,0,0,1,1],[1,0,0,0,1,1,1,1,0,1],[1,1,1,1,1,1,1,0,1,0],[1,1,1,1,0,1,0,0,1,1]]))



