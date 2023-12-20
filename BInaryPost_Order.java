import java.util.ArrayList;
import java.util.List;

public class BInaryPost_Order {
    public static void main(String[] args) {

    }

    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preorder(result, root);

        return result;
    }

    public static void preorder(List<Integer> result, TreeNode root) {
        if (root != null) {
            result.add(root.val);
            if (root.left != null) {
                preorder(result, root.left);
            }
            if (root.right != null) {
                preorder(result, root.right);
            }
        }

    }
}
