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
    public int rangeSumBST(TreeNode root, int low, int high) {
        int[] sum = {0};
        printInRange(root, low, high, sum);
        return sum[0];
    }

    public void printInRange(TreeNode root, int k1, int k2, int[] sum) {
        if (root == null) {
            return;
        }
        if (root.val >= k1 && root.val <= k2) {
            printInRange(root.left, k1, k2, sum);
            sum[0] += root.val;
            printInRange(root.right, k1, k2, sum);
        } else if (root.val < k1) {
            printInRange(root.right, k1, k2, sum);
        } else {
            printInRange(root.left, k1, k2, sum);
        }
    }
}
