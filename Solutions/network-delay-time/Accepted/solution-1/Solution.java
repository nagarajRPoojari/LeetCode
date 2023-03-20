// https://leetcode.com/problems/network-delay-time

class Solution {
    public int networkDelayTime(int[][] edge, int n, int k) {
        //bellman ford 
        int[] dist=new int[n+1];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[0]=0;
        dist[k]=0;
        for(int i=1;i<n;i++){
            for(int j=0;j<edge.length;j++){
                int u=edge[j][0];
                int v=edge[j][1];
                int w=edge[j][2];
                if(dist[u]!=Integer.MAX_VALUE)
                    dist[v]=Math.min(dist[v],dist[u]+w);
            }
        }
        System.out.println(Arrays.toString(dist));
        int ans=Integer.MIN_VALUE;
        for(int i:dist)
            ans=Math.max(i,ans);
        return ans==Integer.MAX_VALUE ? -1 : ans;
    }
}