// https://leetcode.com/problems/keys-and-rooms

class Solution {
    int count;
    void dfs(boolean[] isV,int u,List<List<Integer>> arr){
        isV[u]=true;
        count++;
        for(int i:arr.get(u))
            if(!isV[i]) dfs(isV,i,arr);
    }
    public boolean canVisitAllRooms(List<List<Integer>> arr) {
        int n=arr.size();
        count=0;
        dfs(new boolean[n],0,arr);
        return count==n;
    }
}