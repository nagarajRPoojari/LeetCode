// https://leetcode.com/problems/longest-palindromic-substring

class Solution {
    public String longestPalindrome(String s) {
       int maxlen=1;
       int start=0;
       int n=s.length();
        
       //for odd window
       for(int i=0;i<s.length();i++){
           int l=i;
           int r=i;
           while(l>=0 && r<n && s.charAt(l)==s.charAt(r)){
               l--;
               r++;
           } 
           if(r-l-1 > maxlen){
               maxlen=r-l-1;
               start=l+1;
           }

       } 
       for(int i=0;i<s.length();i++){
           int l=i;
           int r=i+1;
           while(l>=0 && r<n && s.charAt(l)==s.charAt(r)){
               l--;
               r++;
           } 
           if(r-l-1 > maxlen){
               maxlen=r-l-1;
               start=l+1;
           }
       } 
       return s.substring(start,start+maxlen);
    }
}