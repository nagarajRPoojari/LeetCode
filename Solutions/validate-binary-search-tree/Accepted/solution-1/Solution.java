// https://leetcode.com/problems/validate-binary-search-tree

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
    void  helper(TreeNode root,ArrayList<Integer> arr){
        if(root==null) return;
        helper(root.left,arr);
        arr.add(root.val);
        helper(root.right,arr);
    }
    public boolean isValidBST(TreeNode root) {
       ArrayList<Integer> arr=new ArrayList<>();
       helper(root,arr);
       for(int i=1;i<arr.size();i++){
           if(arr.get(i-1)>=arr.get(i)) return false;
       }
       return true;


    }
}