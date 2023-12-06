public class Symmetric {
    public static void main(String[] args) {
        
    }
    public static boolean isSymmetric(TreeNode root) {
       return IsMirror(root, root); 
    }
    public static boolean IsMirror(TreeNode t1, TreeNode t2){
        if(t1 == null && t2 == null) return true;
        if(t1 == null || t2== null) return false;

        return (t1.val == t2.val) && IsMirror(t1.left, t2.right) && IsMirror(t1.right, t2.left);
    }
}
