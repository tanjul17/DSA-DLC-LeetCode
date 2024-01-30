class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true; 
        }
        return Math.abs(height(root.left) - height(root.right)) <= 1 &&
               isBalanced(root.left) &&
               isBalanced(root.right);
    }

    public int height(TreeNode root) {
        if (root == null) {
            return 0; 
        }
        int l = height(root.left);
        int r = height(root.right);

        return Math.max(l,r) + 1;
    }
}
