// https://leetcode.com/problems/flip-string-to-monotone-increasing

class Solution {
    public int minFlipsMonoIncr(String s) {
        int c1=0,cf=0;
        for(char c:s.toCharArray()){
            if(c=='1') c1++;
            else{
                cf++;
                cf=Math.min(cf,c1);
            }
        }
        return cf;
    }
}