// https://leetcode.com/problems/implement-queue-using-stacks

class MyQueue {
    Stack<Integer> s;
    public MyQueue() {
        s=new Stack<>();
    }
    
    public void push(int x) {
        Stack<Integer> t=new Stack<>();
        while(!s.empty())
            t.push(s.pop());
        t.push(x);
        while(!t.empty())
            s.push(t.pop());
    }
    
    public int pop() {
        return s.pop();
    }
    
    public int peek() {
        return s.peek();
    }
    
    public boolean empty() {
        return s.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */