package sdeSheetQues;

public class QueueImplementation {
    class Node {
        int val;
        Node next;
        Node(int _val) {
            val = _val;
        }
    }
    class LinkedList {
        Node head;
        Node tail;
        LinkedList() {
            head = null;
            tail = null;
        }
        void add(int data) {
            if(head == null) {
                head = new Node(data);
                tail = head;
                return;
            }
            Node toAdd = new Node(data);
            tail.next = toAdd;
            tail = tail.next;
        }
        int remove() {
            if(head == null) {
                return -1;
            }
            int val = head.val;
            head = head.next;
            return val;
        }
    }
    public class Queue {

        LinkedList node;
        Queue() {
            // Implement the Constructor
            node = new LinkedList();
        }

        /*----------------- Public Functions of Queue -----------------*/

        boolean isEmpty() {
            // Implement the isEmpty() function
            return node.head == null;
        }

        void enqueue(int data) {
            // Implement the enqueue() function
            node.add(data);
        }

        int dequeue() {
            // Implement the dequeue() function
            return node.remove();
        }

        int front() {
            // Implement the front() function
            if(isEmpty()) return -1;
            return node.head.val;
        }

    }

}
