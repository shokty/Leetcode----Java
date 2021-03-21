package EZ;


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

public class Symmetric_Tree {
    public boolean isSymmetric(TreeNode root) {
        return isSymmetrichealper(root,root);
    }
    public boolean isSymmetrichealper(TreeNode right,TreeNode left){
        if (right == null && left == null)
            return true;
        if (right == null || left == null)
            return false;
        return right.val == left.val && isSymmetrichealper(left.right,right.left) && isSymmetrichealper(left.left,right.right);
    }
}
