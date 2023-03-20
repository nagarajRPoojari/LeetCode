// https://leetcode.com/problems/strictly-palindromic-number

class Solution {
    public boolean isStrictlyPalindromic(int n) {
        boolean ans=true;
        int rem,rev=0,temp;
        for(int i=2;i<n-1;i++){
            temp=n;
            while(temp>0){
                rem=temp%i;
                rev=rev*i+rem;
                temp=temp/i;
            }
            if(rev!=n){
               ans=false;
                break;
            }
            
        }
        return ans;
    }
}