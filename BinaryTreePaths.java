import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
    public static void main(String[] args) {
        
    }
    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root == null) return result;

        String current_path = Integer.toString(root.val);
        if(root.left == null && root.right == null) result.add(current_path);
        if (root.left != null) {
            DFS(root.left, current_path, result);
        }
        if (root.right != null) {
            DFS(root.right, current_path, result);
        }


        return result;        
    }
    public static void DFS(TreeNode node, String current_path, List<String> result ){
        current_path += "->" + node.val;
        if (node.left == null && node.right == null) {
            result.add(current_path);
            return;
        }
        if (node.left != null) {
            DFS(node.left, current_path, result);
        }
        if (node.right != null) {
            DFS(node.right, current_path, result);
        }

    }

}
