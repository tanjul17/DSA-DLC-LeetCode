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
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null || root.val == val) {
            return root;
        }
        
        // Search in the left subtree if the value is less than the current node's value
        if (val < root.val) {
            return searchBST(root.left, val);
        }
        // Search in the right subtree if the value is greater than the current node's value
        else {
            return searchBST(root.right, val);
        }
    }
}