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
    public int diameterOfBinaryTree(TreeNode root) {
        int diameter[] = new int[1];
        height(diameter, root);
        return diameter[0];
    }
    public int height(int diameter[], TreeNode root){
        if(root == null)
            return 0;
        int lheight = height(diameter, root.left);
        int rheight = height(diameter, root.right);
        
        diameter[0] = Math.max(diameter[0], lheight+rheight);
        
        return 1 + Math.max(lheight, rheight);
    }
}