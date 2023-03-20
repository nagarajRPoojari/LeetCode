// https://leetcode.com/problems/game-of-life

class Solution {
    public void gameOfLife(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int livesCount=count(mat,i,j);
                if(mat[i][j]==1 && livesCount>=2 && livesCount<=3)
                mat[i][j]=3;
                if(mat[i][j]==0 &&  livesCount==3)
                mat[i][j]=2;
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++)
            mat[i][j]>>=1;
        }
        
    }
    static int count(int[][] mat,int r,int c){
        int m=mat.length;
        int n=mat[0].length;
        int lives=0;
        for(int i=Math.max(r-1,0);i<=Math.min(m-1,r+1);i++){
            for(int j=Math.max(c-1,0);j<=Math.min(n-1,c+1);j++)
                lives+=mat[i][j]&1;
        }
        lives-=mat[r][c]&1;
        return lives;
    }
}