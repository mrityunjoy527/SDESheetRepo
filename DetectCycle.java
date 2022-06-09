package sdeSheetQues;

public class DetectCycle {
    class Node<T> {
        public T data;
        public Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }
    static boolean detectCycle(Node<Integer> head) {
        if(head == null || head.next == null) return false;
        Node<Integer> slow = head;
        Node<Integer> fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                return true;
            }
        }
        return false;
    }
}
