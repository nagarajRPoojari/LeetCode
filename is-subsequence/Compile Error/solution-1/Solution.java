// https://leetcode.com/problems/is-subsequence

class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0,j=0;
        if(s.length()==0)
            return true;
        if(t.length()==0 || s.length()>t.length()
            return false;

        
        while(j<t.length()){
            if(t.charAt(j)==s.charAt(i)){
                j++;
                i++;
            }
            else   
                j++;
        }
        if(i==s.length()) return true;
        else return false;
    }
}