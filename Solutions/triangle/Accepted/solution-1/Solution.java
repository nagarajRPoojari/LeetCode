// https://leetcode.com/problems/triangle

class Solution {
    public int minimumTotal(List<List<Integer>> arr) {
        int n=arr.size();
        for(int i=1;i<n;i++){
            for(int j=0;j<=i;j++){
                int curr=arr.get(i).get(j);
                if(j==0) arr.get(i).set(j,curr+arr.get(i-1).get(0));
                else if(j==arr.get(i).size()-1) arr.get(i).set(j,arr.get(i-1).get(j-1)+curr);
                else arr.get(i).set(j,Math.min(arr.get(i-1).get(j-1) , arr.get(i-1).get(j))+curr);
            }
        }
        int ans=Integer.MAX_VALUE;
        for(int i:arr.get(n-1)) ans=Math.min(ans,i);
        return ans;
    }
}