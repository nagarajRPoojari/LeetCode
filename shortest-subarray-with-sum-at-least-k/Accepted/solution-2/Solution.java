// https://leetcode.com/problems/shortest-subarray-with-sum-at-least-k

class Solution {
    public int shortestSubarray(int[] arr, int k) {
        int n=arr.length,res=n+1;
        Deque<Integer> dq=new ArrayDeque<>();
        long[] pre=new long[n+1];
        for(int i=0;i<n;i++) pre[i+1]=pre[i]+arr[i];
        for(int i=0;i<n+1;i++){
            while(!dq.isEmpty() && pre[i]-pre[dq.getFirst()]>=k)
                res=Math.min(res,i-dq.pollFirst());
            while(!dq.isEmpty() && pre[i]<=pre[dq.getLast()])
                dq.pollLast();
            dq.addLast(i);
        }
        return res==n+1 ? -1 : res;

    }
}