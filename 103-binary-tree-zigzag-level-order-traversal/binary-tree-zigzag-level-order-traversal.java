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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>>res = new ArrayList<>();
        if(root==null)return new ArrayList();
        Queue<TreeNode>q = new LinkedList<>();
        q.offer(root);
        boolean flag = false;
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer>ds = new ArrayList<>();
            while(size-->0){
                root=q.poll();
                ds.add(root.val);
                if(root.left!=null)q.add(root.left);
                if(root.right!=null)q.add(root.right);
            } 
            if(flag) Collections.reverse(ds);
            res.add(ds);
            flag = !flag;
        }
        return res;
    }
}