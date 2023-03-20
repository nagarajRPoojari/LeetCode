// https://leetcode.com/problems/detect-capital

class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.toUpperCase().equals(word) || word.toLowerCase().equals(word)) return true;
        int a=(int)word.charAt(0);
        String s=word.substring(1);
        if(a>=65 && a<=90 && s.toLowerCase().equals(s)) return true;
        else return false;
        
    }
}