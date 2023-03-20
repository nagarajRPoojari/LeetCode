// https://leetcode.com/problems/intersection-of-two-arrays

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        Set<Integer> ans=new HashSet<Integer>();
        int a=0,b=0;
        while(a<nums1.length && b<nums2.length){
            if(nums1[a]==nums2[b])
            {
                ans.add(nums1[a]);
                a++;
                b++;
            }
            if(nums1[a]<nums2[b])
                a++;
            else
                b++;
            
        }
        int[] res=new int[ans.size()];
        for(int i=0;i<res.length;i++){
            res[i]=ans.get(i);
        }
        return res;
    }
}