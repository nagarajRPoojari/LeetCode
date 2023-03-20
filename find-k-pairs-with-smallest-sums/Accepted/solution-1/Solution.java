// https://leetcode.com/problems/find-k-pairs-with-smallest-sums

class Solution {
    public List<List<Integer>> kSmallestPairs(int[] a, int[] b, int k) {
        PriorityQueue<int[]> pq=new PriorityQueue<>((i,j)->Integer.compare(i[0]+i[1],j[0]+j[1]));
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<a.length;i++)
            pq.add(new int[]{a[i],b[0],0});
        
        while(k-->0 && !pq.isEmpty()){
            int[] t=pq.poll();
            ans.add(new ArrayList<>(Arrays.asList(t[0],t[1])));
            int idx=t[2];
            if(idx<b.length-1)
                pq.add(new int[]{t[0],b[idx+1],idx+1});     
        }
        return ans;
    }
}