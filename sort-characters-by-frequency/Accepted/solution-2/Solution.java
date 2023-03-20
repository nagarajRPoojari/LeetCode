// https://leetcode.com/problems/sort-characters-by-frequency

class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        List<Character>[] bkt=new List[s.length()+1];
        for(char c:map.keySet()){
            int f=map.get(c);
            if(bkt[f]==null)
                bkt[f]=new ArrayList<>();
            bkt[f].add(c);
        }
       
        StringBuilder ans=new StringBuilder();
        for(int i=bkt.length-1;i>0;i--){
            if(bkt[i]!= null){
                for(char c:bkt[i])
                for(int j=0;j<i;j++)
                    ans.append(c);
            }
        }
        return ans.toString();
    }
}