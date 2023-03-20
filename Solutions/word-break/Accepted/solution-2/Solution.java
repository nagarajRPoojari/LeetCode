// https://leetcode.com/problems/word-break

class Solution {

    public boolean wordBreak(String s, List<String> wordDict) {
       // Set<String> set=new HashSet<>(wordDict);
        int n=s.length();
        boolean[] dp=new boolean[n+1];
        dp[0]=true;
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                dp[i]=wordDict.contains(s.substring(j,i)) && dp[j];
                if(dp[i]) break;
            }
        }
        return dp[n];
    }
}