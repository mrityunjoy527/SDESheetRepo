package sdeSheetQues;

import java.util.*;

public class NextGreater {
    static int[] nextGreater(int[] arr, int n) {
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= arr[i]) st.pop();
            if (!st.isEmpty()) ans[i] = st.peek();
            else ans[i] = -1;
            st.push(arr[i]);
        }
        return ans;
    }
}
