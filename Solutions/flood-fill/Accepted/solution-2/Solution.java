// https://leetcode.com/problems/flood-fill

class Solution {
    void dfs(int[][] g,int r,int c,int color,int prev){
        if(r<0 || c<0 || r>=g.length || c>=g[0].length || g[r][c]!=prev) return;
        g[r][c]=color;
        dfs(g,r-1,c,color,prev);
        dfs(g,r+1,c,color,prev);
        dfs(g,r,c-1,color,prev);
        dfs(g,r,c+1,color,prev);
    }


    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc]!=color)
        dfs(image,sr,sc,color,image[sr][sc]);
        return image;
    }
}