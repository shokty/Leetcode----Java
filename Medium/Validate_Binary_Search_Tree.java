package Medium;

import java.util.LinkedList;
import java.util.Queue;

public class Validate_Binary_Search_Tree {
    Queue<Integer> Q = new LinkedList<>();
    public boolean isValidBST(TreeNode root) {
    enterque(root);
    int prev = Q.poll();
    int curr = Integer.MIN_VALUE;
    while (!Q.isEmpty()){
        curr = Q.poll();
        if (prev  > curr)
            return false;
        prev = curr;
    }
    return true;
    }
    public void enterque(TreeNode node){
        if (node == null)
            return;
        enterque(node.left);
        Q.add(node.val);
        enterque(node.right);
    }

}
