package sdeSheetQues;

public class LowestCommonAncestor {
    class TreeNode<T> {
        T data;
        TreeNode<T> left;
        TreeNode<T> right;

        TreeNode(T data) {
            this.data = data;
            left = null;
            right = null;
        }
    }
    static int lowestCommonAncestor(TreeNode<Integer> root, int x, int y) {
        return f(root, x, y).data;
    }
    static TreeNode<Integer> f(TreeNode<Integer> root, int p, int q) {
        if(root == null || root.data == p || root.data == q) return root;
        TreeNode<Integer> l = f(root.left, p, q);
        TreeNode<Integer> r = f(root.right, p, q);
        if(l == null) return r;
        else if(r == null) return l;
        else return root;
    }
}
