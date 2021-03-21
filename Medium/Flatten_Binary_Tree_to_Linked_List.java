package Medium;
import java.util.LinkedList;
import java.util.Queue;


public class Flatten_Binary_Tree_to_Linked_List {
    Queue<Integer> Q = new LinkedList();
    public void flatten(TreeNode root) {
        if (root == null)
            return;
        entertoque(root);
        TreeNode temp = root;
        while (Q.size() > 1){
            temp.val = Q.poll();
            temp.left = null;
            temp.right = new TreeNode();
            temp = temp.right;
        }
        temp.val = (Q.poll());
    }
    public void entertoque(TreeNode root){
        if (root == null)
            return;
        Q.add(root.val);
        entertoque(root.left);
        entertoque(root.right);
    }
}
