// https://leetcode.com/problems/swap-for-longest-repeated-character-substring

class Solution {
    public int maxRepOpt1(String text) {
       int[] freq=new int[26];
       for(char c:text.toCharArray()) freq[c-'a']++;
       int max=0;
       int ans=0;
       for(int i=0;i<text.length();i++){
           char c=text.charAt(i);
           int j=i,count=0;
           boolean notSwaped=true;
           while(j<text.length() && (c==text.charAt(j) || notSwaped) && count<freq[c-'a']){
               if(c!=text.charAt(j))
                    notSwaped=false;
                count++;
                j++;
           }
            ans=Math.max(ans,count);
       } 
       for(int i=text.length()-1;i>=0;i--){
           char c=text.charAt(i);
           int j=i,count=0;
           boolean notSwaped=true;
           while(j>=0 && (c==text.charAt(j) || notSwaped) && count<freq[c-'a']){
               if(c!=text.charAt(j))
                    notSwaped=false;
                count++;
                j--;
           }
            ans=Math.max(ans,count);
       } 
       



       return ans;
    }
}