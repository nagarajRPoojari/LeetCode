// https://leetcode.com/problems/binary-search-tree-to-greater-sum-tree

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
    int sum=0;
    void helper(TreeNode root){
        if(root==null) return;
        helper(root.right);
        root.val+=sum;
        sum=root.val;
        helper(root.left);
    }
    public TreeNode bstToGst(TreeNode root) {
        sum=0;
        helper(root);
        return root;
    }
}