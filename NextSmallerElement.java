package sdeSheetQues;

import java.util.*;

public class NextSmallerElement {
    static ArrayList<Integer> nextSmallerElement(ArrayList<Integer> arr, int n){
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>();
        st.push(arr.get(n-1));
        ans.add(-1);
        for(int i=n-2; i>=0; i--) {
            while(!st.isEmpty() && st.peek() >= arr.get(i)) st.pop();
            if(!st.isEmpty()) ans.add(0, st.peek());
            else ans.add(0, -1);
            st.push(arr.get(i));
        }
        return ans;
    }
}
