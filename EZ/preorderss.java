package EZ;


import java.util.LinkedList;
import java.util.List;

// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};


public class preorderss {
    private List list = new LinkedList();
    public List<Integer> preorder(Node root) {
        recoursive(root);
        return list;
    }
    public void recoursive(Node root){
        if (root == null)
            return;
        list.add(root.val);
        for (Node child : root.children) {
            recoursive(child);
        }
    }
}
