import java.util.Stack;
//剑指 Offer 09. 用两个栈实现队列
//用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，分别完成在队列尾部插入整数和在队列头部删除整数的功能。(若队列中没有元素，deleteHead 操作返回 -1 )
//
//来源：力扣（LeetCode）
//链接：https://leetcode-cn.com/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof
//著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
class CQueue {
    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();


    public CQueue() {
    }

    //统一往stack1里面插入
    public void appendTail(int value) {
        stack1.push(value);
    }

    //需要取数时，先判断stack2有没有值，没有就把stack1里面的值全放到2里面，若有值就直接排出
    public int deleteHead() {
        if(stack2.empty()){
            while(!stack1.empty()){
                stack2.push(stack1.pop());
            }
        }else{
            return stack2.pop();
        }
        if(stack2.empty()){
            return -1;
        }
        return stack2.pop();
    }


}

/*class CQueue {
    private int value;
    private CQueue next;

    public CQueue() {

    }

    public void appendTail(int value) {
        CQueue cQueue=new CQueue();
        cQueue.value=value;
        CQueue nextCQ=this;
        while (nextCQ.next!=null){
            nextCQ=nextCQ.next;
        }
        nextCQ.next=cQueue;
    }

    public int deleteHead() {
        if(this.next==null){
            return -1;
        }
        CQueue cQueue=this.next;
        this.next=cQueue.next;
        return cQueue.value;
    }

};*/

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue* obj = new CQueue();
 * obj->appendTail(value);
 * int param_2 = obj->deleteHead();
 */