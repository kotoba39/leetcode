class ListNode:
     def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    def addTwoNumbers(self,l1,l2):
        l1List=[]
        l2List=[]
        while l1:
            l1List.append(l1.val)
            l1=l1.next
        while l2:
            l2List.append(l2.val)
            l2=l2.next
        upFlag=False
        p=None
        result=None
        while l1List or l2List or upFlag:
            value=0
            if l1List:
                value+=l1List.pop()
            if l2List:
                value+=l2List.pop()
            if upFlag:
                value+=1
            if value>=10:
                value-=10
                upFlag=True
            else:
                upFlag=False
            result=ListNode(value)
            result.next=p
            p=result
        return  result










    # def addTwoNumbers2(self, l1, l2):
    #     l1len=l1.nodeLength()
    #     l2len=l2.nodeLength()
    #     short=l1len-l2len
    #     #确保l1最长
    #     if short<0:
    #         l1,l2=l2,l1
    #     short = l1len - l2len
    #     result=ListNode(0)
    #     p=result
    #     for i in range(short):
    #         p.next=ListNode(l1.val)
    #         p.next.previous=p
    #         l1=l1.next
    #         p=p.next
    #     while l1:
    #         if l1.val+l2.val>=10:
    #             p.next=ListNode(l1.val+l2.val-10)
    #             q=p
    #             q.val+=1
    #             while q.val>=10:
    #                 q.val-=10
    #                 q=q.previous
    #                 q.val+=1
    #         else:
    #             p.next = ListNode(l1.val+l2.val)
    #         p.next.previous = p
    #         l1=l1.next
    #         l2=l2.next
    #         p=p.next
    #     if result.val !=0:
    #         return result
    #     else:
    #         return  result.next

if __name__ == '__main__':
    s=Solution()
    l1=ListNode(5)
    l2=ListNode(5)
    print(s.addTwoNumbers(l1,l2).val)
    print(s.addTwoNumbers(l1, l2).next.val)






