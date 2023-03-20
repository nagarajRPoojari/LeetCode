// https://leetcode.com/problems/split-with-minimum-sum

class Solution {
    public int splitNum(int num) {
        String n=Integer.toString(num);
        char[] arr=n.toCharArray();
        Arrays.sort(arr);
        int sum=0;
        int mul=1;
        for(int i=arr.length-1;i>=0;i-=2){
            sum+=(arr[i]-'0')*mul;
            mul*=10;
        }
        mul=1;
        for(int i=arr.length-2;i>=0;i-=2){
            sum+=(arr[i]-'0')*mul;
            mul*=10;
        }
        return sum;
    }
}