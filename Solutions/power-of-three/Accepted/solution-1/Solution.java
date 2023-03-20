// https://leetcode.com/problems/power-of-three

class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<=0)
            return false;
        if(n==1)
            return true;
        if(n%3!=0)
            return false;
        else{
             return isPowerOfThree(n/3);
        }
    }
}