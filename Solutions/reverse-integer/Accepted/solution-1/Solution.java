// https://leetcode.com/problems/reverse-integer

class Solution {
    public int reverse(int x) {
        boolean isneg=false;
        if(x<0)
            isneg=true;
        long rev=0,rem;
        x=Math.abs(x);
        
        while(x>0){
            rem=x%10;
            rev=rev*10+rem;
            x/=10;
        }
        if(rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE)
            return 0;
        if(isneg==true)
            return -(int)rev;
        return (int)rev;
    }
}