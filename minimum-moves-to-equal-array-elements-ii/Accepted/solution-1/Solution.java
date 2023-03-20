// https://leetcode.com/problems/minimum-moves-to-equal-array-elements-ii

class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int count=0;
        int target;
        if(n%2==0){
            target=nums[(n/2-1)]+nums[n/2];
            target/=2;
        }
        else
            target=nums[(n-1)/2];
        for(int i=0;i<n;i++){
            count+=Math.abs(nums[i]-target);
        }
        return count;
    }
}