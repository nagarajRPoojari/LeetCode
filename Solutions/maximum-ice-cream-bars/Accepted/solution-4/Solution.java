// https://leetcode.com/problems/maximum-ice-cream-bars

class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int ans=0;
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int bar:costs){
            if(bar<=coins){
                ans++;
                coins-=bar;
                pq.add(bar);
            }else{
                if(!pq.isEmpty() && pq.peek()>bar){
                    coins+=pq.poll();
                    coins-=bar;
                    pq.add(bar);
                }
            }
        }
        return ans;
    }
}