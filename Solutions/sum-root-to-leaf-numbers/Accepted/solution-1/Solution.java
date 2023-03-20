// https://leetcode.com/problems/sum-root-to-leaf-numbers


class Solution {
    int ans=0;
    void helper(TreeNode root,int sum){
        if(root==null) return;
        if(sum==0) sum=root.val;
        else sum=sum*10+root.val;
        if(root.left==null && root.right==null){
            ans+=sum;
        }
        helper(root.left,sum);
        helper(root.right,sum);
        sum=(sum-root.val)/10;
    }
    public int sumNumbers(TreeNode root) {
        ans=0;
        helper(root,0);
        return ans;
    }
}