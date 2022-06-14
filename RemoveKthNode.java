package sdeSheetQues;

public class RemoveKthNode {
    static class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;

        public LinkedListNode(T data) {
            this.data = data;
        }
    }
    static LinkedListNode<Integer> removeKthNode(LinkedListNode<Integer> head, int K) {
        if(head == null) return null;
        LinkedListNode<Integer> dummy = new LinkedListNode(0);
        dummy.next = head;
        LinkedListNode<Integer> slow = dummy;
        LinkedListNode<Integer> fast = dummy;
        for(int i=0; i<K; i++) {
            fast = fast.next;
        }
        while(fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        if(slow.next != null)
            slow.next = slow.next.next;
        return dummy.next;
    }
}
