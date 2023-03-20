// https://leetcode.com/problems/minimum-path-sum

class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length,n=grid[0].length;
        for(int d=1;d<=m+n-2;d++){
            for(int i=0;d-i>=0;i++){
                int j=d-i;
                if(i<0 || j<0 || i>=m || j>=n) continue;
                int temp=grid[i][j];
                grid[i][j]=Integer.MAX_VALUE;
                if(i>0) grid[i][j]=Math.min(grid[i][j],grid[i-1][j]+temp);
                if(j>0) grid[i][j]=Math.min(grid[i][j],grid[i][j-1]+temp);
            }
        }
        return grid[m-1][n-1];
    }
}