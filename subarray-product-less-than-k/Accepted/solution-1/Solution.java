// https://leetcode.com/problems/subarray-product-less-than-k

class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1)
            return 0;
        
        int start=0,currentProduct=1,count=0;
        for(int i=0;i<nums.length;i++){
            currentProduct*=nums[i];
            while(currentProduct>=k)
            {
                currentProduct/=nums[start];
                start++;
            }
            
            count+=i-start+1;
            
        }
        return count;
    }
}