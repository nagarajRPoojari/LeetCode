// https://leetcode.com/problems/find-closest-node-to-given-two-nodes

class Solution {
    void dfs(int[] e,int n,int[] dist,boolean[] isV){
        isV[n]=true;
        if(e[n]!=-1 && !isV[e[n]]){
            dist[e[n]]=dist[n]+1;
            dfs(e,e[n],dist,isV);
        }
    }
    public int closestMeetingNode(int[] edges, int node1, int node2) {
        int ans=-1;
        int dist1[]=new int[edges.length],dist2[]=new int[edges.length];
        boolean isV1[]=new boolean[edges.length],isV2[]=new boolean[edges.length];
        dfs(edges,node1,dist1,isV1);
        dfs(edges,node2,dist2,isV2);
        int minDist=Integer.MAX_VALUE;
        for(int i=0;i<edges.length;i++)
            if(isV1[i]&&isV2[i] && minDist>Math.max(dist1[i],dist2[i])){
                minDist=Math.max(dist1[i],dist2[i]);
                ans=i;
            }
        return ans;
    }
}