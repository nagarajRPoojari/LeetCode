// https://leetcode.com/problems/smallest-even-multiple

class Solution {
    public int smallestEvenMultiple(int n) {
        
        if(n%2==0)
            return n;
        for(int i=n;i<n*2;i+=n){
            if(n%2==0)
                return i;
        }
        return n*2;
    }
}