// https://leetcode.com/problems/find-consecutive-integers-from-a-data-stream

class DataStream {
    int value;
    int k;
    ArrayDeque<Integer> dq;
    int count;
    int curr;
    public DataStream(int value, int k) {
        this.value=value;
        this.k=k;
        dq=new ArrayDeque<>();
        count=0;
        curr=0;
    }
    
    public boolean consec(int num) {
        dq.add(num);
        if(++count<k){
            if(num!=value) curr++;
            return false;
        }
        int f=dq.pollFirst();
        if(f!=value) curr--;
        
        if(num!=value) curr++;
        
        if(f==value && curr==0) return true;
        else return false;
    }
}

/**
 * Your DataStream object will be instantiated and called as such:
 * DataStream obj = new DataStream(value, k);
 * boolean param_1 = obj.consec(num);
 */