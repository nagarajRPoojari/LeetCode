// https://leetcode.com/problems/longest-consecutive-sequence

class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int i:nums)
            set.add(i);
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i]-1)){
                int count=1,j=1;
                while(set.contains(nums[i]+j++))
                    count++;
                ans=Math.max(ans,count);
            }
        }
        return ans;
    }
}