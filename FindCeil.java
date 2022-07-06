package sdeSheetQues;

public class FindCeil {
    static class TreeNode<T> {
        T data;
        TreeNode<T> left;
        TreeNode<T> right;

        TreeNode(T data) {
            this.data = data;
            left = null;
            right = null;
        }
    }
    static int findCeil(TreeNode<Integer> root, int data) {
        int ceil = -1;
        while (root != null){
            if(root.data == data) {
                return root.data;
            }
            if(data > root.data) {
                root = root.right;
            }
            else{
                ceil = root.data;
                root = root.left;
            }
        }
        return ceil;
    }
}
