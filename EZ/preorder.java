package EZ;

import java.util.LinkedList;
import java.util.List;

public class preorder {
    List mylist = new LinkedList();
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root != null) {
            mylist.add(root.val);
        if(root.left != null)
            preorderTraversal(root.left);
        if(root.right != null)
            preorderTraversal(root.right);
        }
        return mylist;
    }
}
