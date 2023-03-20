// https://leetcode.com/problems/word-search

class Solution {
    boolean dfs(char[][] b,String word,int i,int r,int c){
        if(r<0 || c<0 || r>=b.length || c>=b[0].length ||i>=word.length() || word.charAt(i)!=b[r][c]) return false;
        if(i==word.length()-1) return true;
        if(b[r][c]=='.') return false;
        char old=b[r][c];
        b[r][c]='.';
        boolean m=dfs(b,word,i+1,r+1,c);
        boolean n=dfs(b,word,i+1,r,c+1);
        boolean o=dfs(b,word,i+1,r-1,c);
        boolean p=dfs(b,word,i+1,r,c-1);
        b[r][c]=old;
        return m||n||o||p;
    }
    public boolean exist(char[][] b, String word) {
        for(int i=0;i<b.length;i++)
            for(int j=0;j<b[0].length;j++)
                if(dfs(b,word,0,i,j)) return true;
        return false;
    }
}