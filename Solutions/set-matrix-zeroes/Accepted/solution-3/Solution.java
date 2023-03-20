// https://leetcode.com/problems/set-matrix-zeroes

class Solution {
    
    public void setZeroes(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int col1=1;
        for(int i=0;i<m;i++){
            if(mat[i][0]==0) col1=0;
            for(int j=1;j<n;j++)
                if(mat[i][j]==0){
                    mat[i][0]=mat[0][j]=0;
                }
        }
        for(int i=m-1;i>=0;i--){
            for(int j=n-1;j>0;j--)
            if(mat[i][0]==0 || mat[0][j]==0)
                mat[i][j]=0;
            if(mat[i][0]==0 || col1==0)
                mat[i][0]=0;
        }
    }
}