package sdeSheetQues;

public class ReverseNodesInKGroup {
    static class Node {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    static Node getListAfterReverseOperation(Node head, int n, int b[]) {
        Node dummy = new Node(-1);
        Node prev = dummy;
        Node cur = head;
        prev.next = head;
        int k = 0;
        while(cur != null && k<n){
            Node temp1 = cur;
            Node prev1 = prev;
            int j = b[k];
            if(j>0){
                while(cur != null && j>0){
                    Node temp2 = cur;
                    cur = cur.next;
                    temp2.next = prev1;
                    prev1 = temp2;
                    j--;
                }
                prev.next = prev1;
                prev = temp1;
                prev.next = cur;
            }
            k++;
        }
        return dummy.next;
    }
}
