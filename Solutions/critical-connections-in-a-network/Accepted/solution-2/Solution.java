// https://leetcode.com/problems/critical-connections-in-a-network

class Solution {
    List<List<Integer>> ans;
    void dfs(int u,int parent,int[] disc,int[] low,boolean[] isV,int time,List<List<Integer>> arr){
        isV[u]=true;
        disc[u]=low[u]=time++;
        for(int v:arr.get(u)){
            if(v==parent) continue;
            if(!isV[v]){
                dfs(v,u,disc,low,isV,time,arr);
                low[u]=Math.min(low[u],low[v]);
                if(low[v]>disc[u]){
                    List<Integer> t=new ArrayList<>();
                    t.add(v);
                    t.add(u);
                    ans.add(t);
                }
            }
            else
                low[u]=Math.min(low[u],disc[v]);
        }
    }
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> g) {
        List<List<Integer>> arr=new ArrayList<>();
        for(int i=0;i<n;i++)arr.add(new ArrayList<>());
        for(List<Integer> l:g){
            arr.get(l.get(0)).add(l.get(1));
            arr.get(l.get(1)).add(l.get(0));
        }
        ans=new ArrayList<>();
        boolean[] isV=new boolean[n];
        int[] disc=new int[n];
        int[] low=new int[n];
        for(int i=0;i<n;i++)
            if(!isV[i])
            dfs(i,-1,disc,low,isV,0,arr);
        return ans;
    }
}