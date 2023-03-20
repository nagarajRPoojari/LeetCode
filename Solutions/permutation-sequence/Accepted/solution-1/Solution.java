// https://leetcode.com/problems/permutation-sequence

class Solution {
    //the approacg is to see which block k belongs and get corresponding digit
    
    public String getPermutation(int n, int k) {
        ArrayList<Integer> nums=new ArrayList<Integer>();
        StringBuilder ans=new StringBuilder();
        int[] fact=new int[n+1];
        
        fact[0]=1;
        int factt=1;
        for(int i=1;i<=n;i++){
            factt*=i;
            fact[i]=factt;
        }
        
        for(int i=1;i<=n;i++){
            nums.add(i);
        }
        k--;
        for(int i=1;i<=n;i++){
            int index=k/fact[n-i];
            ans.append(String.valueOf(nums.get(index)));
            nums.remove(index);
            k=k-index*fact[n-i];
        }
        return String.valueOf(ans);
        
    }
}