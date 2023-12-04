import java.util.*;

public class TreeInorder {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        // Creating an instance of the SolutionInorder class
        SolutionInorder solution = new SolutionInorder();

        // Calling the inorderTraversal method and print the result
        List<Integer> inorderList = solution.inorderTraversal(root);
        System.out.println("Inorder Traversal: " + inorderList);

    }

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class SolutionInorder {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        dfs(res, root);
        return res;
    }

    void dfs(List<Integer> res, TreeNode node) {
        if (node.left != null) {
            dfs(res, node.left);
        }
        res.add(node.val);
        if (node.right != null) {
            dfs(res, node.right);
        }
    }
}