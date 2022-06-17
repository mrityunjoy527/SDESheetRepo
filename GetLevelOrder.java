package sdeSheetQues;

import java.util.*;

public class GetLevelOrder {
    static class BinaryTreeNode {
        int val;
        BinaryTreeNode left;
        BinaryTreeNode right;

        public BinaryTreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
    static ArrayList<Integer> getLevelOrder(BinaryTreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        if(root == null) return ans;
        Queue<BinaryTreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()) {
            int s = q.size();
            for(int i=0; i<s; i++) {
                BinaryTreeNode n = q.poll();
                ans.add(n.val);
                if(n.left != null) q.add(n.left);
                if(n.right != null) q.add(n.right);
            }
        }
        return ans;
    }
}
