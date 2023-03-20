// https://leetcode.com/problems/minimum-size-subarray-sum

class Solution {
    public int minSubArrayLen(int target, int[] arr) {
        
         int start=0,end=0,sum=0,res=Integer.MAX_VALUE;
        
        while(end<arr.length){
            
            //expanding rightside
            while(sum<target && end<arr.length)
                sum+=arr[end++];
            
            if(sum>=target)//if sum>=target shrink from left to get minimum possible subarray
            {
                while(sum>=target && start <end)
                    sum-=arr[start++];
                res=Math.min(res,end-start+1);
            }
        }
        if(res==Integer.MAX_VALUE)
            return 0;
        return res;
    }
}