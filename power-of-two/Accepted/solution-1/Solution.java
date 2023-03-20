// https://leetcode.com/problems/power-of-two

class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0)
            return false;
        int x=n&(n-1);
        if(x==0){
            return true;
        }
        else{
            return false;
        }
    }
}