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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer,Integer>map = new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        TreeNode root = buildt(preorder,0,preorder.length-1,inorder,0,inorder.length-1,map);
        return root;
    }
    public TreeNode buildt(int [] preorder,int ps, int pe, int inorder[],int is,int ie,Map<Integer,Integer>map){
        if(ps>pe||is>ie)return null;
        TreeNode root = new TreeNode(preorder[ps]);
        int iroot = map.get(root.val);
        int numleft = iroot-is;
        
        root.left = buildt(preorder,ps+1,ps+numleft,inorder,is,iroot-1,map);
        root.right = buildt(preorder,ps+numleft+1,pe,inorder,iroot+1,ie,map);

        return root;
    }
}