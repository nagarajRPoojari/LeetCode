// https://leetcode.com/problems/candy

class Solution {
    public int candy(int[] arr) {
        int[] candy=new int[arr.length];
        Arrays.fill(candy,1);
        for(int i=1;i<arr.length;i++)
            if(arr[i]>arr[i-1])candy[i]=candy[i-1]+1;
        for(int i=arr.length-2;i>=0;i--)
            if(arr[i]>arr[i+1])candy[i]=Math.max(candy[i],candy[i+1]+1);
        int sum=0;
        for(int i:candy) sum+=i;

        return sum;
    }
}