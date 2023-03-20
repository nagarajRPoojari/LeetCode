// https://leetcode.com/problems/fibonacci-number

class Solution {
    
    static int fibb(int n,int a,int b){
        if(n==0)
            return a;
        if(n==1)
            return b;
        return fibb(n-1,b,a+b);
    }
    public int fib(int n) {
        return fibb(n,0,1);
    }
}