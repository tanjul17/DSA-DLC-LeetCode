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
    public List<TreeNode> allPossibleFBT(int n) {
        List<TreeNode> res = new ArrayList<>();
        if(n == 0) return res;
        if(n == 1) {
            res.add(new TreeNode(0));
            return res;
        }
        for(int leftNode = 1; leftNode<n ;leftNode+=2){
            int rightNode = n-1-leftNode;

            List<TreeNode> leftSubtrees = allPossibleFBT(leftNode);
            List<TreeNode> rightSubtrees = allPossibleFBT(rightNode);

            for(TreeNode leftSubtree : leftSubtrees){
                for(TreeNode rightSubtree : rightSubtrees){
                    TreeNode root = new TreeNode(0);
                    root.left = leftSubtree;
                    root.right = rightSubtree;
                    res.add(root);
                }
            }
        }
        return res;
    }
}