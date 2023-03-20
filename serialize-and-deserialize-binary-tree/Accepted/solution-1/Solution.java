// https://leetcode.com/problems/serialize-and-deserialize-binary-tree

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null) return "*,";
        String s=new String();
        s+=String.valueOf(root.val)+",";
        s+=serialize(root.left);
        s+=serialize(root.right);
        return s;
    }

    // Decodes your encoded data to tree.
    int i=-1;
    private TreeNode helper(String[] arr){
        i++;
        if(i>=arr.length || arr[i].equals("*")) return null;
        TreeNode curr=new TreeNode(Integer.parseInt(arr[i]));
        curr.left=helper(arr);
        curr.right=helper(arr);
        return curr;
    }

    public TreeNode deserialize(String data) {
        String[] arr=data.split(",");
        return helper(arr);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));