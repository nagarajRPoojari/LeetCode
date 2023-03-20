// https://leetcode.com/problems/top-k-frequent-elements

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] bkt=new List[nums.length+1];
        Map<Integer,Integer> map=new HashMap<>();
        
        for(int i:nums)
            map.put(i,map.getOrDefault(i,0)+1);
        
        for(int key : map.keySet()){
            int f=map.get(key);
            if(bkt[f]==null)
                bkt[f]=new ArrayList<>();
            bkt[f].add(key);
        }
        int[] ans=new int[k];
        int count=0;
        for(int i=bkt.length-1;i>=0 &&count<k;i--){
            if(bkt[i]!=null)
            for(int j=0;j<bkt[i].size();j++)
                ans[count++]=bkt[i].get(j);
            
        }
        return ans;
    }
}