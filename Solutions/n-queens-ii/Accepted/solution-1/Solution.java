// https://leetcode.com/problems/n-queens-ii

class Solution {
    int ans=0;
    void solve(int n,int c,boolean[] rows,boolean[] diag1,boolean[] diag2){
        if(c==n){
            ans++;
            return;
        }
        for(int i=0;i<n;i++){
            if(rows[i] || diag1[i+c] || diag2[i-c+n-1]) continue;
            rows[i]=diag1[i+c]=diag2[i-c+n-1]=true;
            solve(n,c+1,rows,diag1,diag2);
            rows[i]=diag1[i+c]=diag2[i-c+n-1]=false;
        }
    }
    public int totalNQueens(int n) {
        ans=0;
        solve(n,0,new boolean[n],new boolean[2*n-1],new boolean[2*n-1]);
        return ans;
    }
}


