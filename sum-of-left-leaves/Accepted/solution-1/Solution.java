// https://leetcode.com/problems/sum-of-left-leaves

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
    int count=0;
    void helper(TreeNode root,boolean isLeft){
        if(root==null) return;
        if(isLeft && root.left==null && root.right==null) {
            count+=root.val;
            return;
        }
        helper(root.left,true);
        helper(root.right,false);
    }
    public int sumOfLeftLeaves(TreeNode root) {
        count=0;
        helper(root,false);
        return count;
    }
}