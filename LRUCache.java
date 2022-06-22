package sdeSheetQues;

import java.util.*;
class LRUCache {
    static class Node {
        Node next, prev;
        int key, val;
        public Node(int _key, int _val) {
            key = _key;
            val = _val;
        }
    }
    HashMap<Integer, Node> map;
    Node head = new Node(0, 0), tail = new Node(0, 0);
    int capacity;
    public LRUCache(int _capacity) {
        capacity = _capacity;
        head.next = tail;
        tail.prev = head;
        map = new HashMap<>();
    }

    public int get(int key) {
        if(map.containsKey(key)) {
            Node node = map.get(key);
            remove(node);
            insert(node);
            return node.val;
        }else return -1;
    }

    public void put(int key, int value) {
        if(map.containsKey(key)) {
            remove(map.get(key));
        }
        if(map.size() == capacity) {
            remove(tail.prev);
        }
        insert(new Node(key, value));
    }
    void insert(Node node) {
        map.put(node.key, node);
        Node headnext = head.next;
        head.next = node;
        node.prev = head;
        headnext.prev = node;
        node.next = headnext;
    }
    void remove(Node node) {
        map.remove(node.key);
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
