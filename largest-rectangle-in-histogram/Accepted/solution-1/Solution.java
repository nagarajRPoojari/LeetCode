// https://leetcode.com/problems/largest-rectangle-in-histogram

class Solution {
    public int largestRectangleArea(int[] arr) {
        ArrayDeque<Integer> s=new ArrayDeque<>();
        int n=arr.length;
        int res=0;
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                int top=s.pop();
                int curr=arr[top]*(s.isEmpty() ? i : i-s.peek()-1);
                res=Math.max(res,curr);
            }
            s.push(i);
        }
        while(!s.isEmpty()){
                int top=s.pop();
                int curr=arr[top]*(s.isEmpty() ? n : n-s.peek()-1);
                res=Math.max(res,curr);
            }
        return res;
    }
}