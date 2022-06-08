package sdeSheetQues;

public class DeleteNode {
    static void deleteNode(SortTwoLists.LinkedListNode<Integer> node) {
        // Write your code here.
        node.data = node.next.data;
        node.next = node.next.next;
    }
}
