class CQueue {
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

};

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue* obj = new CQueue();
 * obj->appendTail(value);
 * int param_2 = obj->deleteHead();
 */