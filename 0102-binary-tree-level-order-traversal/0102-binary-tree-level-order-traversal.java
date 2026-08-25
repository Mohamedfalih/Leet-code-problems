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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> res = new ArrayList<>();

        Queue<TreeNode> q = new LinkedList<>();

        if(root == null) return res;

        q.offer(root);

        while(!q.isEmpty()){
            
            List<Integer> list = new ArrayList<>();

            for(int i = q.size() ; i > 0 ; i--){

                TreeNode curr = q.poll();
                list.add(curr.val);

                if(curr.left != null)
                    q.offer(curr.left);
                if(curr.right != null)
                    q.offer(curr.right);

            }
            res.add(list);

        }

        return res;
    }
}