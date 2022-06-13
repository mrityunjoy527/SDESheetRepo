package sdeSheetQues;

import java.util.*;

public class SubsetSum {
    static ArrayList<Integer> subsetSum(int num[]) {
        ArrayList<Integer> l = new ArrayList<>();
        f(0, 0, num, l);
        Collections.sort(l);
        return l;
    }
    static void f(int i, int sum, int[] a, ArrayList<Integer> l) {
        if(i == a.length) {
            l.add(sum);
            return;
        }
        sum += a[i];
        f(i+1, sum, a, l);
        sum -= a[i];
        f(i+1, sum, a, l);
    }
}
