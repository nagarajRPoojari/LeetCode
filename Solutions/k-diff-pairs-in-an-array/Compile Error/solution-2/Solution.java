// https://leetcode.com/problems/k-diff-pairs-in-an-array

class Solution {
    public int findPairs(int[] nums, int target) {
        int count=0;
        
        int n=nums.length;
        Arrays.sort(nums);
        Map<Integer,Integer> map=new HashMap<>();
        
        
       for(int i=0;i<n;i++){
            if(!map.containsKey(nums[i])){
                if(map.containsKey(nums[i]-target) || map.containsKey(target-nums[i]))
                count++;
                map.put(nums[i],1);
            }
            else if(target==0){
                if(map.get(nums[i])==1)
                    count++;
                map.put(nums[i],map.getOrDefault(nums[i])+1);
            }
            
        }
        return count;
    }
}