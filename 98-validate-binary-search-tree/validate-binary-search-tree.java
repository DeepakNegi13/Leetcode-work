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
    public static void inOrderTra(TreeNode root, ArrayList<Integer> arr) {
		if (root == null) return;
		inOrderTra(root.left, arr);
		arr.add(root.val);
		inOrderTra(root.right, arr);
	}
    public boolean isValidBST(TreeNode root) {
        if(root == null || (root.left == null && root.right == null)) return true;
        ArrayList<Integer> arr = new ArrayList<>();
		inOrderTra(root, arr);
        int pre = Integer.MIN_VALUE;
        for(int i = 0;i<arr.size();i++){
            if(i==0 && arr.get(i) == pre){}
            else if(arr.get(i)<=pre) return false;
            pre = arr.get(i);
        }
        return true;

    }
}