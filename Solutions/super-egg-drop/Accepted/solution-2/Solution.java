// https://leetcode.com/problems/super-egg-drop

class Solution {
    public int superEggDrop(int k, int n) {
        int[][] table=new int[n+1][k+1];
        
        int moves=0;
        while(table[moves][k]<n){
            moves++;
            for(int egg=1;egg<=k;egg++){
                table[moves][egg]=table[moves-1][egg]+1+table[moves-1][egg-1];
                //there exists a floor thats why we add 1
            }
        }
        return moves;
    }
}