// https://leetcode.com/problems/intersection-of-two-arrays-ii

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int a=0,b=0;
        ArrayList<Integer> ans=new ArrayList<Integer>();
        while(a<nums1.length && b<nums2.length){
            if(nums1[a]==nums2[b]){
                ans.add(nums1[a]);
                a++;
                b++;
            }
            else if(nums1[a]<nums2[b])
                a++;
            else 
                b++;
        }
        int[] res=new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            res[i]=ans.get(i);
        }
        return res;
    }
}