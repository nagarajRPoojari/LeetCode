// https://leetcode.com/problems/container-with-most-water

class Solution {
    public int maxArea(int[] arr) {
        int n=arr.length;
        int i=0,j=n-1;
        
        int currArea=0,res=0;
        while(i<j){
            currArea=(j-i)*Math.min(arr[i],arr[j]);
            res=Math.max(res,currArea);
            if(arr[i]>=arr[j])
            {
                j--;
            }
            else i++;
        }
        return res;
    }
}