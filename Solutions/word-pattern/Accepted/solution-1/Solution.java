// https://leetcode.com/problems/word-pattern

class Solution {
    public boolean wordPattern(String p, String s) {
        String[] arr=s.split(" ");
        if(arr.length!=p.length()) return false;
        Map<Character,String> map1=new HashMap<>();
        Map<String,Character> map2=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            char c=p.charAt(i);
            String w=arr[i];
            if(!map1.containsKey(c)) map1.put(c,w);
            if(!map2.containsKey(w)) map2.put(w,c);
            if(!map1.get(c).equals(w) || map2.get(w)!=c) return false;
        }
        return true;

    }
}