// https://leetcode.com/problems/repeated-dna-sequences

class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> seen=new HashSet<String>(),repeated=new HashSet<String>();
        for(int i=0;i+9<s.length();i++){
            String sub=s.substring(i,i+10);
            if(seen.contains(sub))
                repeated.add(sub);
            else
                seen.add(sub);
        }
        return new ArrayList<String>(repeated);
        
    }
}