// https://leetcode.com/problems/path-sum-ii


class Solution {
    static List<List<Integer>> ans=new ArrayList<>();
    static void helper(TreeNode root,int target,List<Integer> temp){
        if(root==null) return;
        temp.add(root.val);
        if(root.val==target && root.right==null && root.left==null) {
            ans.add(new ArrayList<>(temp));
            temp.remove(temp.size()-1);
            return;
        }
        helper(root.left , target-root.val,temp);
        helper(root.right , target-root.val,temp);
        temp.remove(temp.size()-1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        ans=new ArrayList<>();
        helper(root,targetSum,new ArrayList<>());
        return ans;
    }
}