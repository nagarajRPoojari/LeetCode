// https://leetcode.com/problems/next-greater-element-ii

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        Arrays.fill(ans,-1);
        ArrayDeque<Integer> s=new ArrayDeque<>();
        for(int i=0;i<2*n;i++){
            while(!s.isEmpty() && nums[s.peek()]< nums[i%n])
                ans[s.pop()]=nums[i%n];
            s.push(i%n);            
        }
        return ans;
    }
}