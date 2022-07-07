package sdeSheetQues;

public class FloorInBST {
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
    static int floorInBST(TreeNode<Integer> root, int data) {
        int floor = -1;
        while (root != null){
            if(root.data == data) {
                return root.data;
            }
            if(root.data > data){
                root = root.left;
            }
            else {
                floor = root.data;
                root = root.right;
            }
        }
        return floor;
    }
}
