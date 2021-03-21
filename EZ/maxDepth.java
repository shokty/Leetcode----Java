package EZ;
public class maxDepth {
    public int maxDepth(TreeNode root) {

    return root == null ? 0 : 1 + Integer.max((root.left != null) ? maxDepth(root.left) : 0, (root.right != null) ? maxDepth(root.right) : 0);
    }
}
