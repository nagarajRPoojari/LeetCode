// https://leetcode.com/problems/sqrtx

class Solution {
    public int mySqrt(int x) {
        int low=1,high=x;
        if(x==0)
            return 0;
        while(true){
            int mid=low+(high-low)/2;
            
            //mid*mid is not used because it may cause overflow for large values of mid
            if(mid>x/mid)
                high=mid-1;
            else
            {
                if((mid+1)>x/(mid+1))
                    return mid;
                low=mid+1;
            }
        }
    }
}