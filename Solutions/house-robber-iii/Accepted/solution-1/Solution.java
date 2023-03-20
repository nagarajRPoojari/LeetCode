// https://leetcode.com/problems/house-robber-iii

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
    public int rob(TreeNode root) {
        if(root==null) return 0;
        if(root.val<0) return -root.val;
         int a=rob(root.left)+rob(root.right);
         int b=root.val;
         if(root.left!=null ) b+= rob(root.left.left)+rob(root.left.right);
         if(root.right!=null ) b+= rob(root.right.left)+rob(root.right.right);
         root.val= -(Math.max(a,b));
         return -root.val;
    }
}