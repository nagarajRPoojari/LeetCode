// https://leetcode.com/problems/word-break-ii

class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        Set<String> set=new HashSet<>(wordDict);
        return dfs(s,set,new HashMap<String,LinkedList<String>>());
    }
    List<String> dfs(String s,Set<String> set,Map<String,LinkedList<String>> map){
        if(map.containsKey(s)) return map.get(s);
        LinkedList<String> res= new LinkedList<String>();
        if(s.length()==0){
           res.add("");
           return res;
        }
        for(String word:set){
            if(s.startsWith(word)){
                List<String> subList=dfs(s.substring(word.length()),set,map);
                for(String t:subList)
                    res.add(word+(t.length()==0 ? "" : " ")+t);
            }
        }
        map.put(s,res);
        return res;
    }
}