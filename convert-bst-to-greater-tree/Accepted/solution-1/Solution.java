// https://leetcode.com/problems/convert-bst-to-greater-tree


class Solution {
    int sum=0;
    void helper(TreeNode root){
        if(root==null) return;
        helper(root.right);
        root.val+=sum;
        sum=root.val;
        helper(root.left);
    }
    public TreeNode convertBST(TreeNode root) {
        sum=0;
        helper(root);
        return root;
    }
}