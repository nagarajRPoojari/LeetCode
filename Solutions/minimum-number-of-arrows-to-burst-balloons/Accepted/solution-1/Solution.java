// https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons

class Solution {
    public int findMinArrowShots(int[][] arr) {
        Arrays.sort(arr,(i,j)->Integer.compare(i[0],j[0]));
        int count=1;
        int end=arr[0][1];
        for(int i=1;i<arr.length;i++){
            if(end<arr[i][0]){
                end=arr[i][1];
                count++;
            }
            else{
                end=Math.min(arr[i][1],end);
            }
        }
        return count;
    }
}