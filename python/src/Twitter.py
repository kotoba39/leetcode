class Twitter:

    def __init__(self):
        self.tweetDict=[]
        self.followDict={}


    def postTweet(self, userId: int, tweetId: int):
            self.tweetDict.append([userId,tweetId])

    def getNewsFeed(self, userId: int):
        result=[]
        followList=[userId]
        if self.followDict.get(userId, 0) != 0:
            followList+=self.followDict[userId]
        tweetListLen=len(self.tweetDict)
        for i in range(tweetListLen):
            if len(result)==10:
                return result
            twitterUser=self.tweetDict[tweetListLen-1-i][0]
            for followee in followList:
                if twitterUser==followee:
                    result.append(self.tweetDict[tweetListLen-1-i][1])
        return result[0:10]

    def follow(self, followerId: int, followeeId: int) -> None:
        if followerId!=followeeId:
            if self.followDict.get(followerId, 0) == 0:
                self.followDict[followerId]=[followeeId]
            else:
                for i in self.followDict[followerId]:
                    if i==followeeId:
                        return
                self.followDict[followerId].append(followeeId)

    def unfollow(self, followerId: int, followeeId: int) -> None:
        if self.followDict.get(followerId, 0)!=0:
            lenList=len(self.followDict[followerId])
            for i in range(lenList):
                if self.followDict[followerId][i] == followeeId:
                    self.followDict[followerId].pop(i)
                    return

if __name__ == '__main__':
    twitter = Twitter()
    twitter.postTweet(1,5)
    twitter.follow(1,2)
    twitter.unfollow(1, 1)
    print(twitter.getNewsFeed(1))

