// https://leetcode.com/problems/subtree-of-another-tree


class Solution {
    boolean isSameTree(TreeNode root1,TreeNode root2){
        if(root1==null && root2==null) return true;
        if(root1==null || root2==null) return false;
        return root1.val==root2.val && isSameTree(root1.left,root2.left) && isSameTree(root1.right,root2.right);
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null && subRoot==null) return true;
        if(root==null || subRoot==null) return false;
        Boolean x=false;
        if(root.val==subRoot.val){
            x=isSameTree(root,subRoot);
        }
        return x || isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
    }
}