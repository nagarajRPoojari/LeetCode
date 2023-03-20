// https://leetcode.com/problems/maximal-score-after-applying-k-operations

class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);
        }
        long ans=0;
        for(int i=0;i<k;i++){
            int a=pq.poll();
            ans+=a;
            int x=a%3==0 ? a/3 : a/3 +1 ;
            pq.add(x);
            System.out.println(a +" "+ ans +" "+x);
        }
        return ans;
    }
}