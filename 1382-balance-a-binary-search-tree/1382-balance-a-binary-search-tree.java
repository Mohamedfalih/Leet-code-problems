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

    static void dfs(TreeNode root , List<Integer> list){
        if(root == null) return;

        dfs(root.left , list);
        list.add(root.val);
        dfs(root.right , list);


    }

    static TreeNode bst(List<Integer> list , int left , int right){

        if(left > right){
            return null;
        }
        int mid = (left+right) / 2 ;

        TreeNode root = new TreeNode(list.get(mid));

        root.left = bst(list , left , mid-1);
        root.right = bst(list , mid+1 , right);

        return root;

    }
    public TreeNode balanceBST(TreeNode root) {
        
        ArrayList<Integer> list = new ArrayList<>();
        dfs(root , list);

        return bst(list , 0 , list.size()-1);

    }
}