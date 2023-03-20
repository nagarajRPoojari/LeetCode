// https://leetcode.com/problems/is-graph-bipartite

class Solution {
    boolean dfs(int[][] graph,int u,int[] color,int c){
        color[u]=c;
        for(int v:graph[u])
            if(color[v]==-1 && !dfs(graph,v,color,(c+1)%2)) return false;
            else if(color[v]!=(c+1)%2)  return false;
        return true;
    }

    public boolean isBipartite(int[][] graph) {
        int[] color=new int[graph.length];
        Arrays.fill(color,-1);
        for(int i=0;i<graph.length;i++)
            if(color[i]==-1 && !dfs(graph,i,color,0)) return false;
        return true;
    }
}