// https://leetcode.com/problems/symmetric-tree

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
    static boolean areSame(TreeNode root1,TreeNode root2){
        if(root1==null  && root2==null) return true;
        if(root1==null || root2==null) return false;
        if(root1.val!=root2.val) return false;

        return areSame(root1.left,root2.right) && areSame(root1.right,root2.left) ;
    }
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return false;
        return areSame(root.left,root.right);
    }
}