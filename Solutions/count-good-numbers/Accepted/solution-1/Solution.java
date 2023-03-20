// https://leetcode.com/problems/count-good-numbers

class Solution {
    static int M=(int)1e9+7;

    static long pow(int a,long n){
        if(n==0) return 1;
        long ans=pow(a,n/2);
        if(n%2==0)
            return (ans*ans)%M;
        else return ((ans*ans)%M * a)%M;
    }

    public int countGoodNumbers(long n) {
        return (int)((pow(5,(n+1)/2)*pow(4,n/2))%M);
    }
}