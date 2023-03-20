// https://leetcode.com/problems/find-eventual-safe-states

class Solution {
    void dfs(int u,int[][] g,boolean[] isV,boolean[] isSafe){
        isV[u]=true;
        int count=0;
        for(int i:g[u]){
            if(!isV[i]){
                dfs(i,g,isV,isSafe);
                if(isSafe[i])
                    count++;
            }
            else if(isSafe[i])
                count++;
        }
        if(count==g[u].length) isSafe[u]=true;
    }


    public List<Integer> eventualSafeNodes(int[][] g) {
        List<List<Integer>> arr=new ArrayList<>();
        int n=g.length;
        boolean[] isV=new boolean[n];
        boolean[] isSafe=new boolean[n];
        for(int i=0;i<g.length;i++) if(g.length==0)  isSafe[i]=true;
        for(int i=0;i<g.length;i++)
            if(!isV[i])
                dfs(i,g,isV,isSafe);
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<isSafe.length;i++) if(isSafe[i]) ans.add(i);
        return ans;
    }
}