class Solution:
    def maxProfit(self, prices):
        result=0
        size=len(prices)
        if size >0:
            minN = prices[0]
            for i in range(size):
                minN=min(minN,prices[i])
                result=max(result,prices[i]-minN)
        return result


if __name__ == '__main__':
    s=Solution()
    print(s.maxProfit([]))

