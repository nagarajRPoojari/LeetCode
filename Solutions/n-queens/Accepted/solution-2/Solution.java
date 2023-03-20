// https://leetcode.com/problems/n-queens

class Solution {
    List<List<String>> ans;
    void construct(char[][] b){
        List<String> t=new ArrayList<>();
        for(int i=0;i<b.length;i++)
            t.add(String.valueOf(b[i]));
        ans.add(t);
    }
    void solve(char[][] b,int c,boolean[] rows,boolean[] diag1,boolean[] diag2){
        if(c==b.length){
            construct(b); return;
        }
        for(int i=0;i<b.length;i++){
            if(rows[i] || diag1[i+c] || diag2[i-c+b.length-1]) continue;
            rows[i]=diag1[i+c]=diag2[i-c+b.length-1]=true;
            b[i][c]='Q';
            solve(b,c+1,rows,diag1,diag2);
            b[i][c]='.';
            rows[i]=diag1[i+c]=diag2[i-c+b.length-1]=false;
        }
    }
    public List<List<String>> solveNQueens(int n) {
        ans=new ArrayList<>();
        char[][] b=new char[n][n];
        for(int i=0;i<n;i++) Arrays.fill(b[i],'.');
        solve(b,0,new boolean[n],new boolean[2*n-1],new boolean[2*n-1]);
        return ans;
    }
}