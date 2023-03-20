// https://leetcode.com/problems/maximum-number-of-integers-to-choose-from-a-range-i

class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        int ans=0;
        int sum=0;
        Set<Integer> set=new HashSet<>();
        for(int i:banned) set.add(i);
        for(int i=1;i<=n;i++){
            if(sum+i<=maxSum && !set.contains(i)){
                sum+=i;
                ans++;
            }
        }
        return ans;
    }
}