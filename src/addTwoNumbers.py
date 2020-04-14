class ListNode:
     def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    def addTwoNumbers(self, l1, l2):
        result=ListNode(0)
        p=result
        up=False
        while l1 or l2:
            value=0
            if l1:
                value+=l1.val
                l1=l1.next
            if l2:
                value += l2.val
                l2 = l2.next
            if up:
                value+=1
            if value >=10:
                up=True
                value -=10
            else:
                up=False
            p.next=ListNode(value)
            p=p.next
        if up:
            p.next = ListNode(1)
        return result.next


if __name__ == '__main__':
    s=Solution()
    l1=ListNode(5)
    l2=ListNode(5)
    print(s.addTwoNumbers(l1,l2).val)
    print(s.addTwoNumbers(l1, l2).next.val)






