public class TreeToString {
    static StringBuilder sb;

    public static void main(String[] args) {

    }

    public static String tree2str(TreeNode root) {
        sb = new StringBuilder();
        dfs2(root);
        return sb.toString();
    }

    public static void dfs2(TreeNode node) {
        if (node == null) {
            return;
        }
        sb.append(String.valueOf(node.val));
        if (node.left == null && node.right == null) {
            return;
        }
        sb.append("(");
        dfs2(node.left);
        sb.append(")");
        if (node.right != null) {
            sb.append("(");
            dfs2(node.right);
            sb.append(")");
        }

    }
}
