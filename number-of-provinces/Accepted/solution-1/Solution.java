// https://leetcode.com/problems/number-of-provinces

class Solution {
    void dfs(int[][] g,boolean[] isV,int u){
        isV[u]=true;
        for(int i=0;i<g.length;i++)
            if(g[u][i]==1 && !isV[i]) dfs(g,isV,i);
    }
    public int findCircleNum(int[][] g) {
        int count=0;
        boolean[] isV=new boolean[g.length];
         for(int i=0;i<g.length;i++){
            if(!isV[i]){
                count++;
                dfs(g,isV,i);
            }
        }
        return count;
    }
}