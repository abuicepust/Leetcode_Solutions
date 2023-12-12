public class ConsBST {    
    public static void main(String[] args) {
        int[] nums = {-10, -3, 0, 1, 10};
        TreeNode root = sortedArrayToBST(nums);
        printInOrder(root);
    }
    static int[] Nums;
    public static TreeNode sortedArrayToBST(int[] nums) {
        Nums = nums;
        return buildBST(0, nums.length-1);
    }
    private static TreeNode buildBST(int s, int e){
        if (s > e) return null;

        int mid = (s + e)/2;

        TreeNode current = new TreeNode(Nums[mid]);

        current.left = buildBST(s, mid - 1);
        current.right = buildBST(mid + 1, e);

        return current;            
    }
    private static void printInOrder(TreeNode root) {
        if (root != null) {
            printInOrder(root.left);
            System.out.print(root.val + " ");
            printInOrder(root.right);
        }
    }
}
