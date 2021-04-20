# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

    def create(arr):
        result=ListNode(0)
        p=result
        for i in arr:
            p.next=ListNode(i)
            p=p.next
        return result.next

    def print(ln):
        p=ln
        while p is not None:
            print(p.val)
            p=p.next


class Solution:
    def mergeTwoLists(self, l1: ListNode, l2: ListNode):
        if l1==None:
            return l2
        if l2==None:
            return l1
        if l1.val>l2.val:
            l1,l2=l2,l1
        result = l1
        p=l1.next
        if p ==None:
            l1.next=l2
            return l1
        q=l2
        while l2 is not None:
            if p.val>l2.val:
                l1.next=q
                l2 = l2.next
                q.next=p
                q=l2
                l1=l1.next
            elif p.next==None:
                p.next=l2
                return result
            else:
                p=p.next
                l1=l1.next
        return result

if __name__ == '__main__':
    s=Solution()
    l1=ListNode.create([5])
    l2=ListNode.create([1,2,4])
    ListNode.print(s.mergeTwoLists(l1,l2))
