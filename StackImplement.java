package sdeSheetQues;

public class StackImplement {
    public static class Stack {
        int[] a;
        int top;
        Stack(int capacity) {
            a = new int[capacity];
            top = -1;
        }
        void push(int num) {
            if(top == a.length-1) return;
            a[++top] = num;
        }
        int pop() {
            if(top == -1) return -1;
            return a[top--];
        }
        int top() {
            if(top == -1) return -1;
            return a[top];
        }
        int isEmpty() {
            return top == -1 ? 1 : 0;
        }
        int isFull() {
            return top == a.length-1 ? 1 : 0;
        }
    }
}
