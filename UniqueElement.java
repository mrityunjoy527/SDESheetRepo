package sdeSheetQues;

import java.util.ArrayList;

public class UniqueElement {
    static int uniqueElement(ArrayList<Integer> arr) {
        int ans = 0;
        for(int i: arr) {
            ans ^= i;
        }
        return ans;
    }
}
