// https://leetcode.com/problems/sliding-window-maximum

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayDeque<Integer> dq=new ArrayDeque<>();
        int n=nums.length;
        int[] ans=new int[n-k+1];
        int j=0;
        for(int i=0;i<n;i++){
            if(!dq.isEmpty() && dq.getFirst()<=i-k)
                dq.poll();
            while(!dq.isEmpty() && nums[dq.getLast()]<nums[i])
                dq.pollLast();
            dq.offer(i);
            if(i>=k-1)
                ans[j++]=nums[dq.getFirst()];
        }
        return ans;
        }
}