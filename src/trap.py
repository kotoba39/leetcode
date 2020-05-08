class Solution:
    def trap(self, height):
        trapLen=0
        trapResult=0
        maxLeft=0
        result=0
        endIndex=-1
        for i in range(len(height)):
            if maxLeft==0:
                if height[i]>0:
                    endIndex=self.findHeighter(height,i)
                    if endIndex>0:
                        maxLeft=height[i]
                        trapLen=endIndex-i-1
                continue
            if endIndex and i !=endIndex:
                trapResult += maxLeft - height[i]
                continue
            result += trapResult - trapLen * (maxLeft - min(maxLeft, height[i]))
            trapLen = 0
            maxLeft = height[i]
            trapResult = 0
            endIndex=self.findHeighter(height,i)
            if endIndex<0:
                maxLeft=0
            else:
                maxLeft = height[i]
                trapLen = endIndex - i - 1
        return result

    def findHeighter(self,height,n):
        num=height[n]
        min = num
        max=0
        maxIndex=-1
        for i in range(n+1,len(height)):
            if num<=height[i]:
                max=height[i]
                maxIndex=i
                break
            else :
                min=min if min <height[i] else height[i]
                if max<=height[i] and min <num:
                    max=height[i]
                    maxIndex=i
        return maxIndex if min< num and max>min and maxIndex-1>n else -1

if __name__ == "__main__":
    # execute only if run as a script
    s=Solution()
    print(s.trap([2,0,2]))
    print(s.trap([4,2,3]))
    #print(s.trap([0,1,0,2,1,0,1,3,2,1,2,1]))

