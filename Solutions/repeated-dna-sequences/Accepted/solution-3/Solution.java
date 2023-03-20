// https://leetcode.com/problems/repeated-dna-sequences

class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        if(s.length()>100000) return new ArrayList<String>();

        Set<Integer> set1=new HashSet<>(),set2=new HashSet<>();
        List<String> ans=new ArrayList<>();
        int[] chars=new int[26];
        chars['C'-'A']=1;
        chars['G'-'A']=2;
        chars['T'-'A']=3;
        for(int i=0;i+9<s.length();i++){
            int v=0;
            for(int j=i;j<i+10;j++){
                v<<=2;
                v=v|chars[s.charAt(j)-'A'];
            }
            if(set1.contains(v)){
                if(!set2.contains(v)){
                    set2.add(v);
                    ans.add(s.substring(i,i+10));
                }
            }
            set1.add(v);
        }        
        return ans;
    }
}

/*Set<String> seen=new HashSet<String>(),repeated=new HashSet<String>();
        for(int i=0;i+9<s.length();i++){
            String sub=s.substring(i,i+10);
            if(seen.contains(sub))
                repeated.add(sub);
            else
                seen.add(sub);
        }
        return new ArrayList<String>(repeated); */