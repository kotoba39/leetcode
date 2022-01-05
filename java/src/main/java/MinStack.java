import java.util.Stack;

//剑指 Offer 30. 包含min函数的栈
//定义栈的数据结构，请在该类型中实现一个能够得到栈的最小元素的 min 函数在该栈中，调用 min、push 及 pop 的时间复杂度都是 O(1)。
class MinStack {
    private Stack<Integer> data=new Stack<>();
    private Stack<Integer> min=new Stack<>();

    public MinStack() {

    }

    //比min栈顶小于或等于的都要入min栈
    public void push(int x) {
        data.push(x);
        if (min.empty() || x <= min.peek()) {
            min.push(x);
        }
    }

    public void pop() {
        int num=data.pop();
        if(num==min.peek()){
            min.pop();
        }
    }

    public int top() {
        if (data.empty()) {
            return -1;
        }
        return data.peek();
    }

    public int min() {
        if (min.empty()) {
            return -1;
        }
        return min.peek();
    }
}

/*
class MinStack {
    private int data;
    private MinStack next;

    */
/**
 * initialize your data structure here.
 *//*

    public MinStack() {

    }

    public void push(int x) {
        MinStack minStack = new MinStack();
        minStack.data = x;
        minStack.next = this.next;
        this.next = minStack;
    }

    public void pop() {
        if (this.next != null) {
            this.next = this.next.next;
        }

    }

    public int top() {
        return this.next.data;
    }

    public int min() {
        MinStack minStack = this.next;
        int min=minStack.data;
        while(minStack.next!=null){
            if(min>minStack.next.data){
                min=minStack.next.data;
            }
            minStack=minStack.next;
        }
        return min;
    }
}*/
