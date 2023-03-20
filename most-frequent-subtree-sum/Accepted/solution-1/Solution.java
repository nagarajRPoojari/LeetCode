// https://leetcode.com/problems/most-frequent-subtree-sum

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    Map<Integer,Integer> map=new HashMap<>();
    int helper(TreeNode root){
        if(root==null) return 0;
        int sum=root.val;
        sum+=helper(root.left);
        sum+=helper(root.right);
        map.put(sum,map.getOrDefault(sum,0)+1);
        return sum;
    }
    public int[] findFrequentTreeSum(TreeNode root) {
        map=new HashMap<>();
        helper(root);
        ArrayList<Integer> list=new ArrayList<>();
        int max=Integer.MIN_VALUE;
        for(int i:map.keySet())
            max=Math.max(max,map.get(i));
        for(int i:map.keySet())
            if(map.get(i)==max) list.add(i);
        int[] arr=new int[list.size()];
        for(int i=0;i<list.size();i++) arr[i]=list.get(i);
        return arr;         
    }
}