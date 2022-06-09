package sdeSheetQues;

public class FindIntersection {
    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;
        public LinkedListNode(T data)
        {
            this.data = data;
        }
    }
    static int findIntersection(LinkedListNode<Integer> heada, LinkedListNode<Integer> headb) {
        if(heada == null || headb == null) return -1;
        LinkedListNode<Integer> a = heada;
        LinkedListNode<Integer> b = headb;
        while(a != b) {
            a = a == null ? headb : a.next;
            b = b == null ? heada : b.next;
        }
        if(a == null) return -1;
        return a.data;
    }
}
