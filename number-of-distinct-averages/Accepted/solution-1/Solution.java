// https://leetcode.com/problems/number-of-distinct-averages

class Solution {
    public int distinctAverages(int[] nums) {
        Set<Double> set=new HashSet<Double>();
        Arrays.sort(nums);
        int i=0,j=nums.length-1;
        while(i<j){
            double avg=(double)(nums[i]+nums[j])/2;
            set.add(avg);
            i++;
            j--;
        }
        return set.size();
    }
}