// https://leetcode.com/problems/minimum-operations-to-make-array-equal

class Solution {
    public int minOperations(int n) {
        int mid;
        if(n%2==0){
            mid=n;
        }
        else
            mid=n; 
        int count=0;
        for(int i=0;i<n/2;i++)
        {
            count+=mid-(2*i)-1;
        }
        return count;
    }
}