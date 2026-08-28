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

    static TreeNode bst(int[] arr , int left , int right){

        if(left > right){
            return null;
        }
        int mid = (left+right) / 2 ;

        TreeNode root = new TreeNode(arr[mid]);

        root.left = bst(arr , left , mid-1);
        root.right = bst(arr , mid+1 , right);

        return root;

    }
    public TreeNode balanceBST(TreeNode root) {
        
        List<Integer> list = new ArrayList<>();
        dfs(root , list);

        int[] arr = new int[list.size()];
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = list.get(i);
        }

        return bst(arr , 0 , arr.length-1);

    }
}