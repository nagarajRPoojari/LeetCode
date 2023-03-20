// https://leetcode.com/problems/powx-n

class Solution {
    public double myPow(double x, int n) {
        if(n==0)
            return 1;
        if(n%2==0)
        {
            double temp=myPow(x,n/2);
            return temp*temp;
        }
        else if(n%2!=0)
            double temp=myPow(x,n-1);
            return temp*x;
        }
        return 0;
    }
}