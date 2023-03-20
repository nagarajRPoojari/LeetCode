// https://leetcode.com/problems/longest-continuous-subarray-with-absolute-diff-less-than-or-equal-to-limit

class Solution {
    public int longestSubarray(int[] nums, int limit) {
        ArrayDeque<Integer> max=new ArrayDeque<>();
        ArrayDeque<Integer> min=new ArrayDeque<>();

        int s=0,maxLen=-1;

        for(int i=0;i<nums.length;i++){
            while(!max.isEmpty() && nums[max.getLast()]<=nums[i])
                max.pollLast();
            max.add(i);
            while(!min.isEmpty() && nums[min.getLast()]>=nums[i])
                min.pollLast();
            min.add(i);

            
            boolean x=(nums[i]==nums[min.getFirst()]);
            boolean y=(nums[i]==nums[max.getFirst()]);
            if(x||y){
                ArrayDeque<Integer> dq=(x? max:min);
                while(nums[max.getFirst()]-nums[min.getFirst()]>limit)
                    s=dq.pollFirst()+1;
            }
            maxLen=Math.max(maxLen,i-s+1);
        }

        return maxLen;
    }
}