class Solution:
    # def distributeCandies(self, candies, num_people):
    #     candies2 = 2 * candies
    #     index = 1
    #     result = []
    #     while index * (index + 1) > candies2 or candies2 >= (index + 1) * (index + 2):
    #         index += 1
    #     #完整的循环轮数
    #     r=math.floor(index/num_people)
    #     #最后一轮有多少小朋友按规则领了
    #     s=index%num_people
    #     lastCount = int((candies2 - (index * (index + 1))) / 2)
    #     c = (r-1) * r * num_people / 2
    #     c2=r * (r + 1 ) * num_people / 2
    #     for i in range(1,num_people+1):
    #         if i<=s:
    #             result.append(int(c2+(r+1)*i))
    #         elif i==(s+1):
    #             result.append(int(c+r*i+lastCount))
    #         else :
    #             result.append(int(c+r*i))
    #     return result
    def distributeCandies(self, candies, num_people):
        result = []
        for i in range(num_people):
            result.append(0)
        index=0
        cnum=0
        while candies>0:
            cnum+=1
            last=candies-cnum
            if last>0:
                result[index]+=cnum
            else:
                result[index]+=candies
            candies=last
            index+=1
            if index>=num_people:
                index=0
        return result




if __name__ == '__main__':
    s=Solution()
    #print(s.distributeCandies(10,3))
    print(1/2)