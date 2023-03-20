// https://leetcode.com/problems/n-queens

class Solution {
    List<List<String>> ans;
    void construct(int[][] b){
        List<String> t=new ArrayList<>();
        for(int i=0;i<b.length;i++){
            String s=new String();
            for(int j=0;j<b.length;j++)
                s+=b[i][j]==0? '.' : 'Q';
            t.add(s);
        }
        ans.add(t);
    }
    boolean isSafe(int[][] b,int r,int c){
        for(int i=0;i<c;i++) if(b[r][i]==1) return false;
        for(int i=r,j=c;i>=0 && j>=0;i--,j--) if(b[i][j]==1) return false;
        for(int i=r,j=c;i<b.length && j>=0;i++,j--) if(b[i][j]==1) return false;
        return true;
    }
    void solve(int[][] b,int c){
        if(c==b.length){
            construct(b); return;
        }
        for(int i=0;i<b.length;i++){
            if(isSafe(b,i,c)){
                b[i][c]=1;
                solve(b,c+1);
                b[i][c]=0;
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        ans=new ArrayList<>();
        solve(new int[n][n],0);
        return ans;
    }
}