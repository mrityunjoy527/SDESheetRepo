package sdeSheetQues;

public class RotateList {
    static class Node {
        int data;
        Node next;

        Node(int x) {
            this.data = x;
            this.next = null;
        }
    }
    static Node rotate(Node head, int k) {
        if(head == null || head.next == null || k == 0) return head;
        Node cur = head;
        int cnt = 1;
        while(cur.next != null) {
            cnt++;
            cur = cur.next;
        }
        k = cnt - k % cnt;
        cur.next = head;
        while(k-- > 0) {
            cur = cur.next;
        }
        head = cur.next;
        cur.next = null;
        return head;
    }
}
