// https://leetcode.com/problems/count-pairs-of-similar-strings

class Solution {
    public int similarPairs(String[] words) {
        int count=0;
        Arrays.sort(words);
        for(int i=0;i<words.length;i++){
            String s=words[i];
            Set<Character> set1=new HashSet<>();
            Set<Character> set2;
            
            
            for(char c:s.toCharArray()) set1.add(c);
            
            for(int j=i+1;j<words.length;j++) {
                set2=new HashSet<>();
                for(char c:words[j].toCharArray()) set2.add(c);
                
                count+= set1.equals(set2) ? 1 : 0;
            }
        }
        return count;
    }
}