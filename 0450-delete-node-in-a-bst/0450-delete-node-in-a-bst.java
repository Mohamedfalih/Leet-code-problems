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
    
    static int findMin(TreeNode root) {
		
		while(root.left != null) {
			root = root.left;
		}
		return root.val;
	}

    public TreeNode deleteNode(TreeNode root, int key) {

        if (root == null)
            return null;

        if (root.val == key) {

            if (root.left == null && root.right == null)
                return null;
            else {

                if (root.left == null)
                    return root.right;
                if (root.right == null)
                    return root.left;
                
                root.val = findMin(root.right);
                root.right = deleteNode(root.right , root.val);
            }
        }

        if (root.right != null && root.val < key)
            root.right = deleteNode(root.right , key);
        else
            root.left = deleteNode(root.left , key);

        return root;

    }
}