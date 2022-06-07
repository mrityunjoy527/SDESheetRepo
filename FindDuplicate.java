package sdeSheetQues;

import java.util.ArrayList;

public class FindDuplicate {
    static int findDuplicate(ArrayList<Integer> a, int n){
        int slow = a.get(0);
        int fast = a.get(0);
        do {
            slow = a.get(slow);
            fast = a.get(a.get(fast));
        }while(slow != fast);
        fast = a.get(0);
        while(slow != fast) {
            slow = a.get(slow);
            fast = a.get(fast);
        }
        return slow;
    }
}
