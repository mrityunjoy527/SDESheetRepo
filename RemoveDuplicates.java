package sdeSheetQues;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    static int removeDuplicates(ArrayList<Integer> arr, int n) {
        Set<Integer> set = new HashSet<>();
        for(int i: arr) {
            set.add(i);
        }
        return set.size();
    }
}
