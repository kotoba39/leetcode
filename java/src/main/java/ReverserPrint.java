//剑指 Offer 06. 从尾到头打印链表
//输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
public class ReverserPrint {
    //head为null表示长度为0.head的val是有值的
    public int[] reversePrint(ListNode head) {
        int length=getLenth(head);
        int[] result=new int[length];
        ListNode node=head;
        for(int i=length;i>0;i--){
            result[i-1]=node.val;
            node=node.next;
        }
        return result;
    }

    private int getLenth(ListNode head){
        int count=0;
        ListNode node=head;
        while(node!=null){
            count++;
            node=node.next;
        }
        return count;
    }
}