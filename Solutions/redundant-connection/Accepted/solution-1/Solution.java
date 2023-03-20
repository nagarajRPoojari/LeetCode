// https://leetcode.com/problems/redundant-connection

class Solution {
    int c_start=-1;
    void dfs(int u,List<List<Integer>> arr,Set<Integer> set,int p,boolean[] isV){
        if(isV[u]) {  c_start=u; return;}
        isV[u]=true;
        for(int v:arr.get(u)){
            if(v==p) continue;
            if(set.isEmpty()) dfs(v,arr,set,u,isV);
            if(c_start!=-1) set.add(u);
            if(c_start==u) {
                c_start=-1;
                return;
            }
        }
    }
    public int[] findRedundantConnection(int[][] mat) {
        int n=mat.length+1;
        List<List<Integer>> arr=new ArrayList<>();
        for(int i=0;i<n;i++) arr.add(new ArrayList<>());
        for(int i=0;i<mat.length;i++){
            arr.get(mat[i][0]).add(mat[i][1]);
            arr.get(mat[i][1]).add(mat[i][0]);
        }
        boolean[] isV=new boolean[n];
        Set<Integer> set=new HashSet<>();
        c_start=-1;
        dfs(1,arr,set,-1,isV);
        for(int i=mat.length-1;i>=0;i--)
            if(set.contains(mat[i][0]) && set.contains(mat[i][1])) return mat[i];
        return null;
    }
}