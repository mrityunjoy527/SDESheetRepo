package sdeSheetQues;

import java.util.Stack;
public class QueueImplement {
    // Define the data members(if any) here.
    Stack<Integer> st1;
    Stack<Integer> st2;
    QueueImplement() {
        // Initialize your data structure here.
        st1 = new Stack<>();
        st2 = new Stack<>();
    }

    void enQueue(int val) {
        // Implement the enqueue() function.
        st1.push(val);
    }

    int deQueue() {
        // Implement the dequeue() function.
        if(st1.isEmpty()) return -1;
        while(!st1.isEmpty()) {
            st2.push(st1.pop());
        }
        int val = st2.pop();
        while(!st2.isEmpty()) {
            st1.push(st2.pop());
        }
        return val;
    }

    int peek() {
        // Implement the peek() function here.
        if(st1.isEmpty()) return -1;
        while(!st1.isEmpty()) {
            st2.push(st1.pop());
        }
        int val = st2.peek();
        while(!st2.isEmpty()) {
            st1.push(st2.pop());
        }
        return val;
    }

    boolean isEmpty() {
        // Implement the isEmpty() function here.
        return st1.isEmpty();
    }
}
