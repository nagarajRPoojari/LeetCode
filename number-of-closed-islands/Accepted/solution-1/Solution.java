// https://leetcode.com/problems/number-of-closed-islands

class Solution {
    int dfs(int r,int c,int[][] grid,int m,int n){
        if(r<0 || c<0 || r>=m || c>=n) return 0;
        if(grid[r][c]==1) return 1;
        grid[r][c]=1;
        return dfs(r-1,c,grid,m,n) * dfs(r+1,c,grid,m,n) * dfs(r,c+1,grid,m,n) * dfs(r,c-1,grid,m,n);
    }

    public int closedIsland(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int count=0;
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
                if(grid[i][j]==0){
                    count+=dfs(i,j,grid,m,n);
                }
        return count;
    }
}