// https://leetcode.com/problems/implement-stack-using-queues

class MyStack {
    ArrayDeque<Integer> dq;
    public MyStack() {
        dq=new ArrayDeque<>();
    }
    
    public void push(int x) {
        ArrayDeque<Integer> temp=new ArrayDeque<>();
        temp.add(x);
        while(!dq.isEmpty())
            temp.add(dq.remove());
        dq=temp;
    }
    
    public int pop() {
        return dq.remove();
    }
    
    public int top() {
        return dq.getFirst();
    }
    
    public boolean empty() {
        return dq.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */