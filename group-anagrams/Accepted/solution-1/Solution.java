// https://leetcode.com/problems/group-anagrams

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();
        for(String s:strs){
            char[] alphabet=new char[26];
            for(char c:s.toCharArray()) alphabet[c-'a']++;
            String keystr=String.valueOf(alphabet);
            
            if(!map.containsKey(keystr)) map.put(keystr,new ArrayList<>());
            
            map.get(keystr).add(s);
        }
        return new ArrayList<>(map.values());
    }
}