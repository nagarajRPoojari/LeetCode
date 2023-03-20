// https://leetcode.com/problems/maximum-ice-cream-bars

class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int ans=0;
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        int i=0;
        while(i<costs.length){
            int bar=costs[i];
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
            i++;
        }
        return ans;

    }
}