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
    public int goodNodes(TreeNode root) {
        return getCount(root,Integer.MIN_VALUE)+1;
    }
    
    public int getCount(TreeNode root, int value) {
        int left =0;
        
        if(root == null)
            return 0;
        
        if(value != Integer.MIN_VALUE && root.val >= value)
            left++;

        left+=getCount(root.left,Math.max(root.val,value));
        left+=getCount(root.right,Math.max(root.val,value));
        
        return left;
        
    }
    
}