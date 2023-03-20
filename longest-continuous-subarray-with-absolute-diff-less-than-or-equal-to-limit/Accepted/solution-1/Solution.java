// https://leetcode.com/problems/longest-continuous-subarray-with-absolute-diff-less-than-or-equal-to-limit

class Solution {
    public int longestSubarray(int[] nums, int limit) {
        ArrayDeque<Integer> max=new ArrayDeque<>();
        ArrayDeque<Integer> min=new ArrayDeque<>();

        int s=0,maxLen=0;
        int i=0;
        while(i<nums.length){
            while(!max.isEmpty() && nums[max.getLast()]<=nums[i])
                max.pollLast();
            max.offer(i);
            while(!min.isEmpty() && nums[min.getLast()]>=nums[i])
                min.pollLast();
            min.offer(i);

            
            int cmax=nums[max.peek()];
            int cmin=nums[min.peek()];

            if(cmax-cmin>limit){
                s++;
                if(s>min.peek()) min.poll();
                if(s>max.peek()) max.poll();
            }else{
                maxLen=Math.max(maxLen,i-s+1);
                i++;
            }
        }

        return maxLen;
    }
}