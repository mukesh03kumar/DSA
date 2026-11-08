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
    public boolean helper(TreeNode root, int Value){
        if(root == null){
            return true;
        }

        if(root.val != Value){
            return false;
        }

        return helper(root.left, Value) && helper(root.right, Value); 
    }
    public boolean isUnivalTree(TreeNode root) {
        if(root == null){
            return true;
        }

        int Value = root.val;
        return helper(root, Value);
    }
}