// https://leetcode.com/problems/find-if-path-exists-in-graph

class Solution {
    boolean dfs(List<List<Integer>> arr,int u,int d,boolean[] isV){
        isV[u]=true;
        if(u==d) return true;
        for(int v:arr.get(u))
            if(!isV[v] && dfs(arr,v,d,isV)) return true;
        return false;
    }

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> arr=new ArrayList<>();
        for(int i=0;i<n;i++) arr.add(new ArrayList<>());
        for(int i=0;i<edges.length;i++){
            arr.get(edges[i][0]).add(edges[i][1]);
            arr.get(edges[i][1]).add(edges[i][0]);
        }
        return dfs(arr,source,destination,new boolean[n]);
    }
}