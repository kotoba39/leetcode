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