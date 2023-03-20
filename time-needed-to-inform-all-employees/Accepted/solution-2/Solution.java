// https://leetcode.com/problems/time-needed-to-inform-all-employees

class Solution {
    int dfs(List<List<Integer>> arr,int u,int[] time){
        int ans=0;
        for(int i:arr.get(u))
            ans=Math.max(ans,dfs(arr,i,time));
        return ans+time[u];
    }

    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        List<List<Integer>> arr=new ArrayList<>();
        for(int i=0;i<n;i++) arr.add(new ArrayList<>());
        for(int i=0;i<n;i++) if(manager[i]!=-1 )arr.get(manager[i]).add(i);
        return dfs(arr,headID,informTime);
    }
}