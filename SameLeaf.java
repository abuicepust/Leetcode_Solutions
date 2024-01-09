import java.util.ArrayList;
import java.util.List;

public class SameLeaf {
    public static void main(String[] args) {
        
    }
    public static boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<String> S1 = new ArrayList<>();
        List<String> S2 = new ArrayList<>();
        DFS(root1, S1);
        DFS(root2, S2);

        return S1==S2;
    }
    public static void DFS(TreeNode root, List<String> list){
        if(root == null) return;
        if (root.left == null && root.right == null) {
            //String val = String.valueOf(root.val);
            list.add(String.valueOf(root.val));
        }
        DFS(root.left, list);
        DFS(root.right, list);
    }
}
