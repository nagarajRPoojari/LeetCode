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
        if(s.size()<=g.size()){
            g.add(num);
            s.add(g.poll());
        }
        else{
           s.add(num);
           g.add(s.poll());
        }
        if(s.size()==g.size())
            median=(double)(s.peek()+g.peek())/2;
        else
            median=(double)s.peek();
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