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
    long temp = Long.MIN_VALUE;
    public boolean isValidBST(TreeNode root) {
        return findAns(root);
    }
    public boolean findAns(TreeNode root){
        if(root == null){
            return true;
        }
        if(!findAns(root.left))
            return false;
        if(root.val <= temp){
            return false;
        }else{
            temp = root.val;
        }
        if(!findAns(root.right)){
            return false;
        }
        return true;
    }
}