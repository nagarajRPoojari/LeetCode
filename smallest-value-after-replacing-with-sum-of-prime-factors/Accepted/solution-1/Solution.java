// https://leetcode.com/problems/smallest-value-after-replacing-with-sum-of-prime-factors

class Solution {
    static ArrayList<Integer> helper(int n){
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=2;i<n;i++){
            while(n%i==0){
                ans.add(i);
                n/=i;
            }
        }
        if(n>1) ans.add(n);
        return ans;
    }
    static int recur(int n,ArrayList<Integer> arr){
        if(arr.size()==1) return n;
        int sum=0;
        for(int i:arr) sum+=i;
        if(sum==n) return n;
        
        return recur(sum,helper(sum));
    }
    public int smallestValue(int n) {
        return recur(n,helper(n));
    }
}