public class PathSum{
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(5);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        int target = 6;
        System.out.println(hasPathSum(root, target));
    }
    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        if(root.left == null && root.right == null && targetSum - root.val == 0) return true;

        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }
}