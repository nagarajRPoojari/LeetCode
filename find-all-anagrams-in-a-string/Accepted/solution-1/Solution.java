// https://leetcode.com/problems/find-all-anagrams-in-a-string

class Solution {
    static boolean isAnagram(String s,int l,int h,String p){
        int[] chars=new int[26];
        for(int i=l;i<=h;i++) chars[s.charAt(i)-'a']++;
        for(int i=0;i<p.length();i++) chars[p.charAt(i)-'a']--;
        for(int i:chars) if(i!=0) return false;
        return true;
    }
    public List<Integer> findAnagrams(String s, String p) {
        int n=p.length();
        int l=0,h=n-1;
        List<Integer> ans=new ArrayList<Integer>();
        for(int i=0;i<=s.length()-n;i++){
            if(isAnagram(s,i,i+n-1,p))
                ans.add(i);
        }
        return ans;
    }
}