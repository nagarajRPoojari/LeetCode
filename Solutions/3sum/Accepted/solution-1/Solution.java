// https://leetcode.com/problems/3sum

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            
            if(nums[i]>0)
                break;
            if(i>0 && nums[i]==nums[i-1])
                continue;
            int j=i+1;
            int k=n-1;
            
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
            
                if(sum==0){
                    List<Integer> temp=new ArrayList<Integer>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    ans.add(temp);
                    
                    while(j<n-1 &&nums[j]==nums[j+1]) j++;
                    while(k>1 &&nums[k]==nums[k-1]) k--;
                    
                    j++;
                    k--;
                }
                else if(sum>0)
                    k--;
                else 
                    j++;
            }
        }
        return ans;
    }
}