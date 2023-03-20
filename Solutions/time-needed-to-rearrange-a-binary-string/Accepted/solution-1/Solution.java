// https://leetcode.com/problems/time-needed-to-rearrange-a-binary-string

class Solution {
    static int c;
    static void helper(String s){
        c++;
        String str="";
        String temp;
        temp=s.replaceAll("01","10");
        if(!temp.equals(s))
        helper(temp);
    }
    public int secondsToRemoveOccurrences(String s) {
        c=0;
        helper(s);
        
        return c-1;
    }
}