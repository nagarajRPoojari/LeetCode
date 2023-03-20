// https://leetcode.com/problems/binary-number-with-alternating-bits

class Solution {
    public boolean hasAlternatingBits(int n) {
        int x=n&1;
        while(n!=0){
            int a=(n^x)&1;
            if(a==1) return false;
            n>>=1;
            x=x^1;
        }
        return true;
    }
}