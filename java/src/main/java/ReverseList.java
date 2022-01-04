public class ReverseList {
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode newHead=head;
        head=head.next;
        newHead.next=null;
        while(head!=null){
            ListNode tmpNode=newHead;
            newHead=head;
            head=head.next;
            newHead.next=tmpNode;
        }
        return newHead;
    }
}
