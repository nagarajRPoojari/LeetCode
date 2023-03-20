// https://leetcode.com/problems/flood-fill

class Solution {
    void dfs(int[][] g,int r,int c,int color,int prev){
        if(r<0 || c<0 || r>=g.length || c>=g[0].length) return;
        if(g[r][c]==color) return;
        if(g[r][c]!=prev) return;
        prev=g[r][c];
        g[r][c]=color;

        dfs(g,r-1,c,color,prev);
        dfs(g,r+1,c,color,prev);
        dfs(g,r,c-1,color,prev);
        dfs(g,r,c+1,color,prev);
    }


    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        dfs(image,sr,sc,color,image[sr][sc]);
        return image;
    }
}