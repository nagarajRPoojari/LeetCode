// https://leetcode.com/problems/sliding-window-median

class Solution {
    public double[] medianSlidingWindow(int[] nums, int k) {
        PriorityQueue<Integer> s=new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> g=new PriorityQueue<>();
        double[] ans=new double[nums.length-k+1];
        for(int i=0;i<nums.length;i++){
            if(s.size()<=g.size()){
                g.add(nums[i]);
                s.add(g.poll());
            }else{
                s.add(nums[i]);
                g.add(s.poll());
            }
            if(s.size()+g.size()==k){
                double mid;
                if(s.size()==g.size()) mid=(double)((long)s.peek()+(long)g.peek())/2;
                else mid=(double)s.peek();
                int start=i-k+1;
                ans[start]=mid;
                if(!s.remove(nums[start])) g.remove(nums[start]);
            }
        }
        return ans;

    }
}