// https://leetcode.com/problems/maximum-ice-cream-bars

class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int ans=0;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i:costs) pq.add(i);
        while(!pq.isEmpty()){
            if(pq.peek()<=coins){
                ans++;
                coins-=pq.remove();
            }else break;
        }
        return ans;
    }
}