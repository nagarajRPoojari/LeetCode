// https://leetcode.com/problems/bitwise-and-of-numbers-range

class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int i=0;
        while(left!=right){
            i++;
            left>>=1;
            right>>=1;
        }
        return left<<i;
    }
}
