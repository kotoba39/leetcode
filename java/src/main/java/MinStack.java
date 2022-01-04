class MinStack {
    private int data;
    private MinStack next;

    /**
     * initialize your data structure here.
     */
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
}