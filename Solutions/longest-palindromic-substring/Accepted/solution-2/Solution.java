// https://leetcode.com/problems/longest-palindromic-substring

class Solution {
    public String longestPalindrome(String s) {
       int maxlen=0;
       int start=0,end=0;
       int n=s.length();
        
       //for odd window
       boolean[][] isValid=new boolean[n][n];
       for(int i=0;i<n;i++){
           
           for(int j=0;j<=i;j++){
               if(s.charAt(i)==s.charAt(j) && (i-j<=2 || isValid[j+1][i-1]))
                isValid[j][i]=true;

                if(isValid[j][i] && i-j+1 >maxlen){
                    maxlen=i-j+1;
                    start=j;
                    end=i;
                }
           }
       }
       
       
       return s.substring(start,end+1);
    }
}

/*for(int i=0;i<s.length();i++){
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
       return s.substring(start,start+maxlen);*/