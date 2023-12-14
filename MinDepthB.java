public class MinDepthB {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(5);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        System.out.println(minDepth(root));
    }
    public static int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null) {
            return 1 + minDepth(root.right);
        }else if (root.right == null) {
            return 1+ minDepth(root.left);
        }

        return 1 + Math.min(minDepth(root.left), minDepth(root.right));
    }
}
