// https://leetcode.com/problems/insert-interval

class Solution {
    public int[][] insert(int[][] arr, int[] newItem) {
        List<int[]> ans=new ArrayList<>();
        
        int i=0;
        while(i<arr.length && arr[i][1]<newItem[0])
            ans.add(arr[i++]);
        
        while(i<arr.length && arr[i][0]<=newItem[1]){
            newItem[0]=Math.min(arr[i][0],newItem[0]);
            newItem[1]=Math.max(arr[i][1],newItem[1]);
            i++;
        }
        ans.add(newItem);
        while(i<arr.length)
            ans.add(arr[i++]);
        
        return ans.toArray(new int[ans.size()][2]);
    }
}