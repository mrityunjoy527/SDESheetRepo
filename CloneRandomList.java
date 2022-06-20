package sdeSheetQues;

public class CloneRandomList {
    static class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;
        LinkedListNode<T> random;

        public LinkedListNode(T data) {
            this.data = data;
        }
    }
    static LinkedListNode<Integer> cloneRandomList(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> item = head;
        LinkedListNode<Integer> front = head;
        while(item != null) {
            front = item.next;
            LinkedListNode<Integer> copy = new LinkedListNode<Integer>(item.data);
            item.next = copy;
            copy.next = front;
            item = front;
        }
        item = head;
        while(item != null) {
            if(item.random != null) {
                item.next.random = item.random.next;
            }
            item = item.next.next;
        }
        LinkedListNode<Integer> start = new LinkedListNode<Integer>(0);
        LinkedListNode<Integer> copy = start;
        item = head;
        while(item != null) {
            front = item.next.next;
            copy.next = item.next;
            item.next = front;
            copy = copy.next;
            item = item.next;
        }
        return start.next;
    }
}
