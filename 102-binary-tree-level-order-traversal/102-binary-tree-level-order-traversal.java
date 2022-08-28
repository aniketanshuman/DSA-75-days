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
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        List<List<Integer>> ans = new LinkedList<List<Integer>>();
        if(root == null) return ans;
        q.offer(root);
        while(!q.isEmpty()){
            List<Integer> res = new LinkedList<>();
            int levelSize = q.size();
            for(int i=0; i<levelSize; i++){
                 if(q.peek().left!=null) q.offer(q.peek().left);                     
                if(q.peek().right!=null) q.offer(q.peek().right);
                res.add(q.poll().val);
            }
               ans.add(res);
        }         
               return ans;
            }
    }