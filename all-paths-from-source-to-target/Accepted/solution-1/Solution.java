// https://leetcode.com/problems/all-paths-from-source-to-target

class Solution {
    void dfs(List<List<Integer>> ans,int[][] g,int u,boolean[] recSt,List<Integer> t){
        recSt[u]=true;
        t.add(u);
        if(u==g.length-1)
            ans.add(new ArrayList<>(t));
        for(int v:g[u])
            if(!recSt[v]) dfs(ans,g,v,recSt,t);
        t.remove(t.size()-1);
        recSt[u]=false;
    }

    public List<List<Integer>> allPathsSourceTarget(int[][] g) {
        boolean[] recSt=new boolean[g.length];
        List<List<Integer>> ans=new ArrayList<>();
        dfs(ans,g,0,new boolean[g.length],new ArrayList<>());
        return ans;

    }
}