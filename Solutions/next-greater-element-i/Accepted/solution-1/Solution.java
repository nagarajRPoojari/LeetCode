// https://leetcode.com/problems/next-greater-element-i

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1=nums1.length,n2=nums2.length;
        int[] ans=new int[n1];
        ArrayDeque<Integer> s=new ArrayDeque<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=n2-1;i>=0;i--){
            while(!s.isEmpty() && s.peek()<=nums2[i])
                s.pop();

            map.put(nums2[i],s.isEmpty()? -1 : s.peek());
            s.push(nums2[i]);
        }

        for(int i=0;i<n1;i++)
            ans[i]=map.get(nums1[i]);            
        return ans;


    }
}