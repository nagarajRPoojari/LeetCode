// https://leetcode.com/problems/path-sum-ii


class Solution {
    static List<List<Integer>> ans=new ArrayList<>();
    static void helper(TreeNode root,int target,List<Integer> temp){
        if(root==null) return;
        if(root.val==target && root.right==null && root.left==null) {
            temp.add(root.val);
            ans.add(temp);
            return;
        }
        temp.add(root.val);
        helper(root.left , target-root.val,new ArrayList<>(temp));
        helper(root.right , target-root.val,new ArrayList<>(temp));
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        ans=new ArrayList<>();
        helper(root,targetSum,new ArrayList<>());
        return ans;
    }
}