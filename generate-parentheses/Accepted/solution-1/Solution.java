// https://leetcode.com/problems/generate-parentheses

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        helper(ans,0,0,n,"");
        return ans;
    }
    void helper(List<String> ans,int open,int close,int n,String s){
        if(s.length()==2*n){
            ans.add(s);
            return;
        }
        if(open<n) helper(ans,open+1,close,n,s+"(");
        if(close<open) helper(ans,open,close+1,n,s+")");
    }
}