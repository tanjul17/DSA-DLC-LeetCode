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
        List<Double>res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root==null)return res;
        q.offer(root);
        while(!q.isEmpty()){
            int s = q.size();
            List<Integer>sub = new ArrayList<>();
            for(int i=0;i<s;i++){
                if(q.peek().left!=null){
                    q.offer(q.peek().left);
                }
                if(q.peek().right!=null){
                    q.offer(q.peek().right);
                }
                sub.add(q.poll().val);
            }
            double sum = 0;
            for(int i:sub){
                sum+=i;
            }
            double r = sum/sub.size();
            res.add(r); 
        }
        return res;
    }
}