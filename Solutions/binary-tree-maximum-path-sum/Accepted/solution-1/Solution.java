// https://leetcode.com/problems/binary-tree-maximum-path-sum

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
    static int ans;
    static int helper(TreeNode root){
        if(root==null) return 0;
        int maxleft=helper(root.left);
        int maxright=helper(root.right);
        int m1=Math.max(maxright+maxleft+root.val,root.val);
        int m2=Math.max(maxright+root.val,maxleft+root.val);
        int m3=Math.max(m1,m2);

        ans=Math.max(ans,m3);
        int x=Math.max(maxleft,maxright)+root.val > root.val ? Math.max(maxleft,maxright)+root.val : root.val;
        return x;
    }

    public int maxPathSum(TreeNode root) {
        ans=Integer.MIN_VALUE;
        int x=helper(root);
        return ans;
    }
}