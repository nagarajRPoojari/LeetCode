// https://leetcode.com/problems/find-k-closest-elements

class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<int[]> pq=new PriorityQueue<>((i,j)->Integer.compare(j[1],i[1]));
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<k;i++){
            pq.add(new int[]{arr[i],Math.abs(arr[i]-x)});
        }

        for(int i=k;i<arr.length;i++){
            int d=Math.abs(arr[i]-x);
            if(pq.peek()[1]>d){
                pq.poll();
                pq.add(new int[]{arr[i],d});
            }
        }
        while(!pq.isEmpty()) ans.add(pq.remove()[0]);
        Collections.sort(ans);
        return ans;
    }
}