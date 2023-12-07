public class MaxDepthBT {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.left.left = new TreeNode(3);

        System.out.println(maxDepth(root));
    }
    public static int maxDepth(TreeNode root) {
        if(root == null) return 0;
        int l = maxDepth(root.left);
        int r = maxDepth(root.right);

        return 1 + Math.max(l, r);
    }
}
