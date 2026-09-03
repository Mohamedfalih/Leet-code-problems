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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;

        q.offer(root);
        boolean flag = true;

        while (!q.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            int level = q.size();
            while (level-- > 0) {

                TreeNode curr = q.poll();

                list.add(curr.val);
                if (curr.left != null)
                    q.offer(curr.left);
                if (curr.right != null)
                    q.offer(curr.right);

            }
            if(!flag){
                Collections.reverse(list);
            }
            res.add(list);

            flag = !flag;
        }

        return res;
    }
}