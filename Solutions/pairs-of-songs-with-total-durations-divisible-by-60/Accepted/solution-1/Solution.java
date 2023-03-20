// https://leetcode.com/problems/pairs-of-songs-with-total-durations-divisible-by-60

class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int n=time.length,count=0;
        Map<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<n;i++){
            int rem=time[i]%60;
            int target=60-rem;
            if(map.containsKey(target)){
               count+=map.get(target); 
            }
            if(rem==0){
                map.put(60,map.getOrDefault(60,0)+1);
            }
            else
                map.put(rem,map.getOrDefault(rem,0)+1);
        }
        return count;
    }
}