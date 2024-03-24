public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) return "#";
        
        StringBuilder sb = new StringBuilder();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        while (!q.isEmpty()) {
            TreeNode node = q.poll();
            if (node == null) {
                sb.append("# ");
            } else {
                sb.append(node.val).append(" ");
                q.add(node.left);
                q.add(node.right);
            }
        }
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data.equals("#")) return null;
        
        String[] v = data.split(" ");
        Queue<TreeNode> q = new LinkedList<>();
        TreeNode root = new TreeNode(Integer.parseInt(v[0]));
        q.add(root);
        
        for (int i = 1; i < v.length; i++) {
            TreeNode parent = q.poll();
            if (!v[i].equals("#")) {
                TreeNode left = new TreeNode(Integer.parseInt(v[i]));
                parent.left = left;
                q.add(left);
            }
            if (!v[++i].equals("#")) {
                TreeNode right = new TreeNode(Integer.parseInt(v[i]));
                parent.right = right;
                q.add(right);
            }
        }
        return root;
    }
}
