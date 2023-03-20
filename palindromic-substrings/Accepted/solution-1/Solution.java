// https://leetcode.com/problems/palindromic-substrings

class Solution {
    public int countSubstrings(String s) {
        int count=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            int l=i;
            int r=i;
            while(l>=0 && r<n && s.charAt(l)==s.charAt(r)){
                l--;
                r++;
                count++;
            }
        }
        for(int i=0;i<n;i++){
            int l=i;
            int r=i+1;
            while(l>=0 && r<n && s.charAt(l)==s.charAt(r)){
                l--;
                r++;
                count++;
            }
        }
        return count;
    }
}