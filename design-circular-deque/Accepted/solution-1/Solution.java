// https://leetcode.com/problems/design-circular-deque

class MyCircularDeque {
    int[] arr;
    int size,front,rear;
    public MyCircularDeque(int k) {
        arr=new int[k];
        size=k;
        front=-1;
        rear=-1;
    }
    
    public boolean insertFront(int value) {
        if(isFull()) return false;
        if(front<0){
            front++;
            rear++;
        }else front=(front+size-1)%size;
        arr[front]=value;
        return true;
    }
    
    public boolean insertLast(int value) {
        if(isFull()) return false;
        if(rear<0){
            front++;
            rear++;
        }else rear=(rear+1)%size;
        arr[rear]=value;
        return true;
    }
    
    public boolean deleteFront() {
        if(isEmpty()) return false;
        if(rear==front){
            rear=-1;
            front=-1;
        }else
            front=(front+1)%size;
        return true;
    }
    
    public boolean deleteLast() {
        if(isEmpty()) return false;
        if(rear==front){
            rear=-1;
            front=-1;
        }else
            rear=(rear+size-1)%size;
        return true;
    }
    
    public int getFront() {
        return isEmpty()? -1: arr[front];
    }
    
    public int getRear() {
        return isEmpty() ? -1: arr[rear];
    }
    
    public boolean isEmpty() {
        return front==-1 && rear==-1;
    }
    
    public boolean isFull() {
        return (rear+1)%size==front;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */