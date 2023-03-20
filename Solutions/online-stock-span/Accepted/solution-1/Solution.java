// https://leetcode.com/problems/online-stock-span

class StockSpanner {
    ArrayDeque<Integer> s;
    ArrayList<Integer> arr;
    public StockSpanner() {
        s=new ArrayDeque<>();
        arr=new ArrayList<>();
    }
    
    public int next(int price) {
        while(!s.isEmpty() && arr.get(s.peek()) <= price)
            s.pop();
        int res=s.isEmpty() ? arr.size()+1 : arr.size() - s.peek();
        arr.add(price);
        s.push(arr.size()-1);
        return res;  
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */