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
    public TreeNode right(TreeNode root) {
		if (root.right.right == null) return root;
		return right(root.right);
	}

	public TreeNode left(TreeNode root) {
		if (root.left.left == null) return root;
		return left(root.left);
	}

	public TreeNode deleteNode(TreeNode root, int key) {
    if (root == null) return null;

    if (key < root.val) {
        root.left = deleteNode(root.left, key);
    } else if (key > root.val) {
        root.right = deleteNode(root.right, key);
    } else {
        // Zero or one child
        if (root.left == null) return root.right;
        if (root.right == null) return root.left;

        // Two children: replace with inorder successor
        TreeNode successor = root.right;
        while (successor.left != null) {
            successor = successor.left;
        }

        root.val = successor.val;
        root.right = deleteNode(root.right, successor.val);}

        return root;
    }
}