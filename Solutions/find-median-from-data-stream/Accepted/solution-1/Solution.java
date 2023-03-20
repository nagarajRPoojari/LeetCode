// https://leetcode.com/problems/find-median-from-data-stream

class MedianFinder {
    PriorityQueue<Integer> s;
    PriorityQueue<Integer> g;
    double median;
    public MedianFinder() {
        s=new PriorityQueue<>(Collections.reverseOrder());
        g=new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        if(s.size()==0){
            s.add(num);
            median=(double)num;
            return;
        }
        if(s.size()>g.size()){
            if(s.peek()>num){
                g.add(s.poll());
                s.add(num);
            }else g.add(num);
            median=(double)(s.peek()+g.peek())/2;
        }
        else{
            if(num<=s.peek()){
                s.add(num);
            }
            else {
                g.add(num);
                s.add(g.poll());
            }
            median=(double)s.peek();
        }
    }
    
    public double findMedian() {
        return median;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */