package sdeSheetQues;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    static int removeDuplicates(ArrayList<Integer> arr, int n) {
        int i = 0, j = 1;
        for(j=1; j<n; j++) {
            if(arr.get(i) != arr.get(j)) {
                arr.set(++i, arr.get(j));
            }
        }
        return i+1;
    }
}
