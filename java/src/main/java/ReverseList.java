//剑指 Offer 24. 反转链表
//定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
public class ReverseList {
    public ListNode reverseList(ListNode head) {
        ListNode newHead=null;
        ListNode tmpNode=head;
        while(tmpNode!=null){
            ListNode next=tmpNode.next;
            tmpNode.next=newHead;
            newHead=tmpNode;
            tmpNode=next;
        }
        return newHead;
    }
}
