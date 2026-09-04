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
    public boolean symmetric(TreeNode p,TreeNode q){
        if(p==null&&q==null) return true;
        if(p==null||q==null) return false;
        
        if(!symmetric(p.left,q.right)) return false;
        if(!symmetric(p.right,q.left)) return false;
        if(p.val!=q.val) return false;
        else return true;

    }
    public boolean isSymmetric(TreeNode root) {
        return symmetric(root.left,root.right);
    }
}