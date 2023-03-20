// https://leetcode.com/problems/valid-perfect-square

class Solution {
    public boolean isPerfectSquare(int x) {
        long low = 1, high = x, ans = -1;

		while(low <= high)
		{
			long mid = (low + high) / 2;
			if(mid*mid==x)
				return true;
			else if(mid*mid>x)
				high = mid - 1;
			else
			{
				low = mid + 1;
				ans = mid;
			}
		}
        if(ans*ans==x)
            return true;
            
        else return false;
    }
}