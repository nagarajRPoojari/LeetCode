// https://leetcode.com/problems/find-the-pivot-integer

class Solution {
    public int pivotInteger(int n) {
        int sum=n*(n+1)/2;
        int s1=0,s2;
        for(int i=1;i<=n;i++){
            s1+=i;
            s2=sum-s1+i;
            if(s1==s2)
                    return i;
        }
        return -1;
    }
}