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
    public  static boolean flag;
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        flag = true;
        levels(root);
        return flag;
    }
    public int levels(TreeNode root) {
        if(root==null) return 0;
        int leftLevel = levels(root.left);
        int rightLevel = levels(root.right);
        if(Math.abs(leftLevel-rightLevel)>1) flag = false;
        return 1 + Math.max(leftLevel , rightLevel);
    }
}