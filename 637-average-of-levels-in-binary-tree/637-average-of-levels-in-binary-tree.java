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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null) return ans;
        q.offer(root);
        while(!q.isEmpty()){
            double sum = 0;
            int levelSize = q.size();
            for(int i=0; i<levelSize; i++){
                if(q.peek().left!=null) q.offer(q.peek().left);                     
                if(q.peek().right!=null) q.offer(q.peek().right);
                sum = sum + q.poll().val;
            }
            double avg = sum/levelSize;
            ans.add(avg);
        }
        return ans;
    }
}