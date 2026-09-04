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
    public void traverse(List<Integer> li,TreeNode root){
		if(root==null) return;
		li.add(root.val);
		traverse(li,root.left);
		traverse(li,root.right);
				
	}
	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> li = new ArrayList<>();
		traverse(li,root);
		return li;
	}
}