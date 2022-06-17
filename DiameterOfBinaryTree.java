package sdeSheetQues;

public class DiameterOfBinaryTree {
    class TreeNode<T> {
        public T data;
        public TreeNode<T> left;
        public TreeNode<T> right;

        TreeNode(T data) {
            this.data = data;
            left = null;
            right = null;
        }
    }
    static int max;
    public static int diameterOfBinaryTree(TreeNode<Integer> root) {
        max = 0;
        f(root);
        return max;
    }
    static int f(TreeNode<Integer> n) {
        if(n == null) return 0;
        int l = f(n.left);
        int r = f(n.right);
        max = Math.max(max, l+r);
        return 1 + Math.max(l, r);
    }
}
