// https://leetcode.com/problems/recover-binary-search-tree

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
    TreeNode prev=null,first=null,second=null;
    void helper(TreeNode root){
        if(root==null) return;
        helper(root.left);
        if(prev!=null && prev.val>root.val){
            if(first==null) first=prev;
            second=root;
        }
        prev=root;
        helper(root.right);
    }


    public void recoverTree(TreeNode root) {
        first=null;prev=null;second=null;
        helper(root);

        int t=first.val;
        first.val=second.val;
        second.val=t;
    }
}