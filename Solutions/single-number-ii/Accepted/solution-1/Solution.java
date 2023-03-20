// https://leetcode.com/problems/single-number-ii

class Solution {
    public int singleNumber(int[] nums) {
        int a=0,b=0;
        for(int c:nums){
            int t= (~a&b&c) | (a&~b&~c);
            b=(~a&b&~c) | (~a&~b&c);
            a=t;
        }
        // a conatins that which occured one's
        // b contains that which occured twice
        //they didn't mentioned to return that occured ones or twice , so a|b
        return a|b;
    }
}