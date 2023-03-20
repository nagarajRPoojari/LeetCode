// https://leetcode.com/problems/maximum-ice-cream-bars

class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int ans=0;
        Arrays.sort(costs);
        for(int i:costs){
            if(i<=coins){
                coins-=i;
                ans++;
            }
            else break;
        }
        return ans;
    }
}