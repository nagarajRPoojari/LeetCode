// https://leetcode.com/problems/daily-temperatures

class Solution {
    public int[] dailyTemperatures(int[] temp) {
        ArrayDeque<Integer> s=new ArrayDeque<>();
        int n=temp.length;
        int[] ans=new int[n];
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && temp[s.peek()]<=temp[i])
                s.pop();
            ans[i]=s.isEmpty()? 0:s.peek()-i;
            s.push(i);
        }
        return ans;
    }
}