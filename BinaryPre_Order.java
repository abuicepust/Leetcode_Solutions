import java.util.ArrayList;
import java.util.List;

public class BInaryPost_Order {
    public static void main(String[] args) {

    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postorder(result, root);

        return result;
    }

    public static void postorder(List<Integer> result, TreeNode root) {
        if (root != null) {
            if (root.left != null) {
                postorder(result, root.left);
            }
            if (root.right != null) {
                postorder(result, root.right);
            }
            result.add(root.val);
        }

    }
}
