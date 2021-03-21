//package EZ;
//
//public class isSameTree {
//    public static void main(String[] args) {
//        TreeNode test = new TreeNode();
//        test.val = 7;
//        test.left = new TreeNode();
//        test.right = new TreeNode();
//        test.left.val = 3;
//        test.right.val = 15;
//        test.right.left = new TreeNode();
//        test.right.left.val = 9;
//        test.right.right = new TreeNode();
//        test.right.right.val = 20;
//    }
//
//    public boolean isSameTree(TreeNode p, TreeNode q) {
//    return Miror(p,q) || sametree(p,q);
//    }
//
//    private boolean sametree(TreeNode p, TreeNode q) {
//        if(p == null && q == null)
//            return true;
//        else if(p == null || q == null)
//            return false;
//        return (p.val == q.val) && sametree(p.left,q.left) && sametree(p.right,q.right);
//    }
//
//    public boolean Miror(TreeNode left, TreeNode right) {
//        if (left == null && right == null)
//            return true;
//        if(left == null || right == null)
//            return false;
//        return (left.val == right.val)&&
//                Miror(left.left,right.right) &&
//                Miror(left.right,right.left);
//    }
//}
