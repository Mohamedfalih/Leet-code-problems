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
    public TreeNode bstFromPreorder(int[] preorder) {

        Stack<TreeNode> st = new Stack<>();
        
        TreeNode root = new TreeNode(preorder[0]);
        st.push(root);

        for(int i = 1 ; i < preorder.length ; i++){

            TreeNode node = new TreeNode(preorder[i]);

            if(st.peek().val > node.val){

                st.peek().left = node;
                st.push(node);

            }
            else{

                TreeNode parent = null;

                while(!st.isEmpty() && st.peek().val < node.val)
                    parent = st.pop();
                
                parent.right = node;
                st.push(node);
                
            }
            
        }

        return root;
        
    }
}