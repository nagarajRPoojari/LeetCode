// https://leetcode.com/problems/word-break-ii

class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        Set<String> set=new HashSet<>(wordDict);
        int n=s.length();
        List<String>[] dp=new ArrayList[n+1];
        dp[0]=new ArrayList<>();
        dp[0].add("");
        for(int i=1;i<=n;i++){
            dp[i]=new ArrayList<>();
            for(int j=0;j<i;j++){
                String sub=s.substring(j,i);
                if(set.contains(sub) && dp[j].size()!=0){
                    for(String t:dp[j])
                        if(!t.equals(""))    dp[i].add(t+" "+sub);
                        else dp[i].add(sub);
                }
                System.out.println(dp[i]);
            }
        }
        Collections.reverse(dp[n]);
        return dp[n];
    }
}