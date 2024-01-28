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
        if(root == null) return 0;
        int l = diameterOfBinaryTree(root.left) ;
        int r = diameterOfBinaryTree(root.right);
        int lf = height(root.left);
        int ry = height(root.right);
        int self = lf+ry;
        return Math.max(self,Math.max(l,r)); 
    }
    public int height(TreeNode root){
        if(root==null)return 0;
        int l = height(root.left);
        int r = height(root.right);
        return Math.max(l,r)+1;
    }
}