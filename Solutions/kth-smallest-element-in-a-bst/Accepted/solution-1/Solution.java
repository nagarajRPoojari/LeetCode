// https://leetcode.com/problems/kth-smallest-element-in-a-bst

class Solution {
    int c;
    int ans=0;
    void helper(TreeNode root){
        if(root==null) return;
        helper(root.left);
        if(c==1) ans=root.val;
        c--;
        helper(root.right);
    }

    public int kthSmallest(TreeNode root, int k) {
        c=k;
        helper(root);
        return ans;
    }
}