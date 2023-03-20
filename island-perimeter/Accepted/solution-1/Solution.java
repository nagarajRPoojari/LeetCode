// https://leetcode.com/problems/island-perimeter

class Solution {
    int ans=0;
    void dfs(int[][] g,int r,int c){
        if(r<0 || c<0 || r>=g.length || c>=g[0].length){ ans++ ; return ;}
        if(g[r][c]==0) {ans++; return ;}
        if(g[r][c]==2) return;
        g[r][c]=2;
        dfs(g,r-1,c);
        dfs(g,r+1,c);
        dfs(g,r,c-1);
        dfs(g,r,c+1);
        return ;
    }
    public int islandPerimeter(int[][] g) {
        ans=0;
        for(int i=0;i<g.length;i++)
            for(int j=0;j<g[i].length;j++)
                if(g[i][j]==1){
                    dfs(g,i,j);
                    break;
                }

        return ans;
    }
}