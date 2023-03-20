// https://leetcode.com/problems/move-zeroes

class Solution {
    public void moveZeroes(int[] arr) {
        int first=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[first];
                arr[first]=temp;
                first++;
            }
        }
       
    }
}